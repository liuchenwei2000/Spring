/**
 * 
 */
package bean;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
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
