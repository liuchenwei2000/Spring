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
public class PhoneNumber {

	private String areacode;
	private String phoneno;

	public PhoneNumber() {
		super();
	}

	public PhoneNumber(String areacode, String phoneno) {
		super();
		this.areacode = areacode;
		this.phoneno = phoneno;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
}
