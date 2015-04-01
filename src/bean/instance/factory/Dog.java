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
public class Dog implements IBeing {

	private String message;

	public Dog() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void about() {
		System.out.println("汪汪汪" + message);
	}
}