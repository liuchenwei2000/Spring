/**
 * 
 */
package transaction.declarative.xml;

import transaction.TestUtil;

/**
 * XML���õ�����ʽ����ʵ�ַ�ʽʾ��
 * <p>
 * Spring2.0֮�������֮һ��ʹ��tx�����ռ��AOP��
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
		TestUtil.run("transaction/declarative/xml/book_xml.xml");
	}
}
