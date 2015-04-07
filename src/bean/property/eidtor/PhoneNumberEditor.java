/**
 * 
 */
package bean.property.eidtor;

import java.beans.PropertyEditorSupport;

/**
 * PhoneNumber 类型属性编辑器支持类
 * <p>
 * 自定义属性编辑器若放在跟它支持的Bean同一个package下，且类名是XxxBeanEditor这种形式的话，
 * 将无需向Spring容器注册，容器会自动加载识别。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年10月29日
 */
// Spring 大部分默认属性编辑器都直接扩展于 java.beans.PropertyEditorSupport 类
// 用户也可以通过扩展PropertyEditorSupport实现自己的属性编辑器。
public class PhoneNumberEditor extends PropertyEditorSupport {

	/**
	 * 仅需要将配置文件中字面值转换为属性类型的对象即可，因此只需要实现本方法。
	 * 
	 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] values = text.split("-");
		PhoneNumber ph = new PhoneNumber(values[0], values[1]);
		setValue(ph);
	}
}
