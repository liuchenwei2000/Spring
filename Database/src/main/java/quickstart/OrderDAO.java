/**
 * 
 */
package quickstart;

/**
 * 订单操作DAO示例
 * <p>
 * 模拟基本的CRUD操作。
 * <p>
 * DAO 提供了数据读取和写入数据库中的一种方式，它应该以接口的形式发布功能。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月28日
 */
public interface OrderDAO {

	String insert(Order order);
	
	void update(Order order);
	
	void delete(Order order);
	
	Order find(String id);
}
