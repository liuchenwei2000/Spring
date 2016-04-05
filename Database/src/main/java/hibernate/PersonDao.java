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

	void save(Person person);
	
	void update(Person person);
	
	void delete(Person person);
	
	Person find(Long id);
}
