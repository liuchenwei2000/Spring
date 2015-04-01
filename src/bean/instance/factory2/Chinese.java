/**
 * 
 */
package bean.instance.factory2;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��17��
 */
public class Chinese implements IPerson {

	private String name;

	public Chinese() {
		super();
	}

	public Chinese(String name) {
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
	public void sayHello() {
		System.out.println(name + "����ã�");
	}
}