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

	public void save(Person person);
	
	public void update(Person person);
	
	public void delete(Person person);
	
	public Person find(Long id);
}
