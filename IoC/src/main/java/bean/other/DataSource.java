/**
 * 
 */
package bean.other;

/**
 * 要确保DataSource类实例的初始化早于DAO实例。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
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
