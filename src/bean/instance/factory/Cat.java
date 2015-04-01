/**
 * 
 */
package bean.instance.factory;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月17日
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
		System.out.println(name + " 喵喵喵");
	}
}