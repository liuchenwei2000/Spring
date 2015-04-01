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

	public void save(Book book);
	
	public Book find(String name);
	
	public void deleteAll();
}
