/**
 * 
 */
package bean.imports;

/**
 * ģ��DAO��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��4��9��
 */
public class DAO {

	private String name;

	public DAO() {
		super();
	}

	public DAO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DAO [name=" + name + "]";
	}
}
