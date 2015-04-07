/**
 * 
 */
package bean.property.eidtor;

import java.beans.PropertyEditorSupport;

/**
 * PhoneNumber �������Ա༭��֧����
 * <p>
 * �Զ������Ա༭�������ڸ���֧�ֵ�Beanͬһ��package�£���������XxxBeanEditor������ʽ�Ļ���
 * ��������Spring����ע�ᣬ�������Զ�����ʶ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��29��
 */
// Spring �󲿷�Ĭ�����Ա༭����ֱ����չ�� java.beans.PropertyEditorSupport ��
// �û�Ҳ����ͨ����չPropertyEditorSupportʵ���Լ������Ա༭����
public class PhoneNumberEditor extends PropertyEditorSupport {

	/**
	 * ����Ҫ�������ļ�������ֵת��Ϊ�������͵Ķ��󼴿ɣ����ֻ��Ҫʵ�ֱ�������
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
