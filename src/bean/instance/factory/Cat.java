/**
 * 
 */
package bean.instance.factory;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��17��
 */
public class Cat implements IBeing {

	private String name;

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void about() {
		System.out.println(name + " ������");
	}
}