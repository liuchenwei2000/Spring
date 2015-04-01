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

	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee find(String name);
}
