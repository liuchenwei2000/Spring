/**
 * 
 */
package bean.abstracts;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月18日
 */
public class Televison implements IConfigurable {
	
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setContent(String content) {
		this.message = content;
	}

	@Override
	public String getContent() {
		return message;
	}
}
