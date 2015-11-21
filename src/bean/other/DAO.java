/**
 * 
 */
package bean.other;

/**
 * DAO类实例依赖于DataSource类实例的初始化，但并不是直接依赖。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
 */
public class DAO {

	private String name;
	
	public DAO() {
		super();
		System.out.println("DAO initialized");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
