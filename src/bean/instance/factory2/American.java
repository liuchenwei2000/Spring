/**
 * 
 */
package bean.instance.factory2;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��17��
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