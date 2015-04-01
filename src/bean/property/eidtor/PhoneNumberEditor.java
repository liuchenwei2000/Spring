/**
 * 
 */
package bean.property.eidtor;

import java.beans.PropertyEditorSupport;

/**
 * 示例
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年10月29日
 */
public class PhoneNumberEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] values = text.split("-");
		PhoneNumber ph = new PhoneNumber(values[0], values[1]);
		setValue(ph);
	}

	
}
