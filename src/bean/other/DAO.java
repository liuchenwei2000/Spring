/**
 * 
 */
package bean.other;

/**
 * DAO��ʵ��������DataSource��ʵ���ĳ�ʼ������������ֱ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class DAO {

	private String name;
	
	public DAO() {
		super();
		System.out.println("DAO initialized");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
