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

	public void save(Person person);
	
	public void update(Person person);
	
	public void delete(Person person);
	
	public Person find(Long id);
}
