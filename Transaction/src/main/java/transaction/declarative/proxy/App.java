/**
 * 
 */
package transaction.declarative.proxy;

import transaction.TestUtil;

/**
 * 传统古旧的声明式事务实现方式示例
 * <p>
 * Spring2.0之前的做法，使用TransactionProxyFactoryBean。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月5日
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestUtil.run("transaction/declarative/proxy/book_proxy.xml");
	}
}
