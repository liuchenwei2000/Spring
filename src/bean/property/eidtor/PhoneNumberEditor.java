/**
 * 
 */
package bean.property.eidtor;

import java.beans.PropertyEditorSupport;

/**
 * ʾ��
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��29��
 */
public class PhoneNumberEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] values = text.split("-");
		PhoneNumber ph = new PhoneNumber(values[0], values[1]);
		setValue(ph);
	}

	
}
