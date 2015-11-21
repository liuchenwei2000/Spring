/**
 * 
 */
package transaction.declarative.xml;

import transaction.TestUtil;

/**
 * XML配置的声明式事务实现方式示例
 * <p>
 * Spring2.0之后的做法之一，使用tx命名空间和AOP。
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
		TestUtil.run("transaction/declarative/xml/book_xml.xml");
	}
}
