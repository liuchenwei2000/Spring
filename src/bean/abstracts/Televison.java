/**
 * 
 */
package bean.abstracts;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��18��
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
