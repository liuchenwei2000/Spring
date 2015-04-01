/**
 * 
 */
package hibernate;

/**
 * PersonDao
 * <p>
 * 提供基本的CRUD操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月1日
 */
public interface PersonDao {

	public void save(Person employee);
	
	public void update(Person employee);
	
	public void delete(Person employee);
	
	public Person find(Long id);
}
