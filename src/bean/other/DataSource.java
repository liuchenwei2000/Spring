/**
 * 
 */
package bean.other;

/**
 * Ҫȷ��DataSource��ʵ���ĳ�ʼ������DAOʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class DataSource {

	private String name;

	public DataSource() {
		super();
		System.out.println("DataSource initialized");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
