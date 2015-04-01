/**
 * 
 */
package quickstart;

/**
 * 订单操作DAO示例
 * <p>
 * 模拟基本的CRUD操作。
 * <p>
 * DAO的作用在于提供一种手段来读取和写入数据库，它应该通过接口的形式来提供这种功能，让程序的其他部分能够访问它们。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月28日
 */
public interface OrderDAO {

	public String insert(Order order);
	
	public void update(Order order);
	
	public void delete(Order order);
	
	public Order find(String id);
}
