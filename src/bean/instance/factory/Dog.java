/**
 * 
 */
package bean.instance.factory;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��17��
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
		System.out.println("������" + message);
	}
}