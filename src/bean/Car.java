/**
 * 
 */
package bean;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��13��
 */
public class Car {

	private String name;

	public Car() {
		super();
	}

	public Car(String name) {
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
		return "Car [name=" + name + "]";
	}
}
