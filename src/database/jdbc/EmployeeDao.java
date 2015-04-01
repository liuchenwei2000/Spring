/**
 * 
 */
package jdbc;

/**
 * EmployeeDao
 * <p>
 * �ṩ������CRUD������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public interface EmployeeDao {

	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee find(String name);
}
