/**
 * 
 */
package bean.instance;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
 */
public class Book {

	private String name;

	public Book() {
		super();
		System.out.println("创建一个Book实例");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
