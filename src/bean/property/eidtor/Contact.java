/**
 * 
 */
package bean.property.eidtor;

/**
 * ʾ��
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��29��
 */
public class Contact {

	private String name;
	private PhoneNumber phoneNumber;

	public Contact() {
		super();
	}

	public Contact(String name, PhoneNumber phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
