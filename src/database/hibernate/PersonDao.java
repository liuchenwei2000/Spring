/**
 * 
 */
package hibernate;

/**
 * PersonDao
 * <p>
 * �ṩ������CRUD������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��1��
 */
public interface PersonDao {

	public void save(Person employee);
	
	public void update(Person employee);
	
	public void delete(Person employee);
	
	public Person find(Long id);
}
