/**
 * 
 */
package quickstart;

/**
 * ��������DAOʾ��
 * <p>
 * ģ�������CRUD������
 * <p>
 * DAO�����������ṩһ���ֶ�����ȡ��д�����ݿ⣬��Ӧ��ͨ���ӿڵ���ʽ���ṩ���ֹ��ܣ��ó�������������ܹ��������ǡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��28��
 */
public interface OrderDAO {

	public String insert(Order order);
	
	public void update(Order order);
	
	public void delete(Order order);
	
	public Order find(String id);
}
