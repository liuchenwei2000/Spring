/**
 * 
 */
package bean.instance.factory2;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月17日
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
		System.out.println(name + "：你好！");
	}
}
