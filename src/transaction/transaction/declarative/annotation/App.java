/**
 * 
 */
package transaction.declarative.annotation;

import transaction.TestUtil;

/**
 * ע�������ʽ����ʵ�ַ�ʽʾ��
 * <p>
 * Spring2.0֮�������֮һ��ʹ��ע��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��5��
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestUtil.run("transaction/declarative/annotation/book_annotation.xml");
	}
}
