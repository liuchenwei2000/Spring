/**
 * 
 */
package transaction.declarative.proxy;

import transaction.TestUtil;

/**
 * ��ͳ�žɵ�����ʽ����ʵ�ַ�ʽʾ��
 * <p>
 * Spring2.0֮ǰ��������ʹ��TransactionProxyFactoryBean��
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
		TestUtil.run("transaction/declarative/proxy/book_proxy.xml");
	}
}
