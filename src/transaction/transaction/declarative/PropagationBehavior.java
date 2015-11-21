/**
 * 
 */
package transaction.declarative;

import org.springframework.transaction.TransactionDefinition;

/**
 * 传播行为示例
 * <p>
 * 传播行为定义关于客户端和被调用方法的事务边界，用于决定一个新的事务应该被启动还是被挂起，或者是一个方法是否应该在事务性上下文中进行。
 * Spring定义了7种截然不同的传播行为，它们分别对应了EJB的容器管理事务（CMT）中的传播规则，
 * 比如Spring的 PROPAGATION_REQUIRES_NEW等同于CMT的Requires_New。
 * Spring还额外增加了一条CMT中所没有的传播行为（PROPAGATION_NESTED）来支持嵌套式事务。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月4日
 */
public class PropagationBehavior {
	
	/**
	 * 举例说明：
	 * 如果一个方法被声明为通过 PROPAGATION_REQUIRES_NEW行为进行事务处理，那么就意味着事务边界和这个方法本身的边界是一样的：
	 * 一个新的事务随着该方法的开始而启动，并且随着该方法返回或抛出一个异常而结束。
	 * 而如果这个方法具有PROPAGATION_REQUIRED行为，那么事务边界将取决于是否已经有一个事务在运行中。
	 */

	/**
	 * 表示该方法必须在事务中运行，如果当前事务不存在，则会抛出一个异常。
	 */
	public static final int MANDATORY = TransactionDefinition.PROPAGATION_MANDATORY;
	
	/**
	 * 表示如果当前已经存在一个事务，那么该方法将会在嵌套事务中运行。嵌套的事务可以独立于当前事务进行单独地提交或回滚。
	 * 如果当前事务不存在，那么其行为与PROPAGATION_REQUIRED一样。注意各厂商对这种传播行为的支持是有所差异的。
	 */
	public static final int NESTED = TransactionDefinition.PROPAGATION_NESTED;
	
	/**
	 * 表示当前方法不应该运行在事务上下文中，如果当前正有一个事务在运行，则会抛出异常。
	 */
	public static final int NEVER = TransactionDefinition.PROPAGATION_NEVER;
	
	/**
	 * 表示该方法不应该运行在事务中，如果当前事务存在，那在该方法运行期间，当前事务将被挂起。
	 */
	public static final int NOT_SUPPORTED = TransactionDefinition.PROPAGATION_NOT_SUPPORTED;
	
	/**
	 * 表示该方法必须运行在事务中，如果当前事务存在，方法将会在该事务中运行，否则，会启动一个新的事务。
	 */
	public static final int REQUIRED = TransactionDefinition.PROPAGATION_REQUIRED;
	
	/**
	 * 表示该方法必须运行在它自己的事务中，一个新的事务将被启动。如果存在当前事务，在该方法执行期间，当前事务会被挂起。
	 */
	public static final int REQUIRES_NEW = TransactionDefinition.PROPAGATION_REQUIRES_NEW;
	
	/**
	 * 表示该方法不需要事务上下文，但如果存在当前事务的话，那么该方法会在这个事务中运行。
	 */
	public static final int SUPPORTS = TransactionDefinition.PROPAGATION_SUPPORTS;
}
