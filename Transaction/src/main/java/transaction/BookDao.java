/**
 * 
 */
package transaction;

/**
 * BookDao
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public interface BookDao {

	void save(Book book);
	
	Book find(String name);
	
	void deleteAll();
}
