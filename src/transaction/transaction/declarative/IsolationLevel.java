/**
 * 
 */
package transaction.declarative;

import org.springframework.transaction.TransactionDefinition;

/**
 * 隔离级别示例
 * <p>
 * 隔离级别（isolation level）定义了一个事务可能受其他并行事务影响的程度。
 * <p>
 * 多个事务并发运行，经常会操作相同的数据来完成各自的任务，因此会导致如下问题：
 * <li>1，脏读（Dirty read）
 * 脏读发生在一个事务读取了另一个事务改写但尚未提交的数据时。如果改写在稍后被回滚了，那么第一个事务获取的数据就是无效的。
 * <li>2，不可重复读（Nonrepeatable read）
 * 不可重复读发生在一个事务执行相同的查询两次或两次以上，但是每次都得到不同的数据时。这通常是因为另一个并发事务在两次查询期间更新了数据。
 * <li>3，虚读（Phantom read）
 * 虚读和不可重复读类似。它发生在一个事务读取了几行数据，接着另一个并发事务插入了一些数据，在随后的查询中，第一个事务会发现多了一些根本不存在的记录。
 * <p>
 * 理想情形下，事务之间是完全隔离的，从而可以防止这些问题发生。但是完全隔离会导致性能问题，因为它通常会锁定数据库中的记录，阻碍并发性。
 * 同时，并不是所有的应用程序都需要完全的隔离，所以需要在事务隔离上有一定的灵活性，因此有了多种隔离级别。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月4日
 */
public class IsolationLevel {

	/**
	 * 使用后台数据库默认的隔离级别。
	 */
	public static final int DEFAULT = TransactionDefinition.ISOLATION_DEFAULT;
	
	/**
	 * 允许读取尚未提交的数据变更，可能会导致脏读、虚读和不可重复读。
	 */
	public static final int READ_UNCOMMITTED = TransactionDefinition.ISOLATION_READ_UNCOMMITTED;
	
	/**
	 * 允许读取并发事务已经提交的数据，可以防止脏读，但是虚读和不可重复读仍有可能发生。
	 */
	public static final int READ_COMMITTED = TransactionDefinition.ISOLATION_READ_COMMITTED;
	
	/**
	 * 对同一行的数据多次读取结果是一致的，除非数据是被本事务自己所修改。
	 * 可以阻止脏读和不可重复读，但虚读仍有可能发生。
	 */
	public static final int REPEATABLE_READ = TransactionDefinition.ISOLATION_REPEATABLE_READ;

	/**
	 * 完全服从ACID的隔离级别，确保不发生脏读、不可重复读和虚读。
	 * 这是最慢的事务隔离级别，因为它通常是通过完全锁定事务相关的数据表来实现的。
	 */
	public static final int SERIALIZABLE = TransactionDefinition.ISOLATION_SERIALIZABLE;
}
