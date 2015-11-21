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
public class American implements IPerson {

	private String message;

	public American() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello," + message);
	}
}
