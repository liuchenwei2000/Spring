/**
 * 
 */
package bean.lifecycle.destroy;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
 */
public class Item {

	private String name;

	public Item() {
		super();
		System.out.println("创建一个Item实例");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}