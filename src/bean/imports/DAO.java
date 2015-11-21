/**
 * 
 */
package bean.imports;

/**
 * 模拟DAO层
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年4月9日
 */
public class DAO {

	private String name;

	public DAO() {
		super();
	}

	public DAO(String name) {
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
		return "DAO [name=" + name + "]";
	}
}
