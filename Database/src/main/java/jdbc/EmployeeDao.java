/**
 * 
 */
package jdbc;

/**
 * EmployeeDao
 * <p>
 * 提供基本的CRUD操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public interface EmployeeDao {

	void save(Employee employee);
	
	void update(Employee employee);
	
	void delete(Employee employee);
	
	Employee find(String name);
}
