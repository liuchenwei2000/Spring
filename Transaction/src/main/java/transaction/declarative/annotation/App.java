/**
 * 
 */
package transaction.declarative.annotation;

import transaction.TestUtil;

/**
 * 注解的声明式事务实现方式示例
 * <p>
 * Spring2.0 之后的做法之一，使用注解驱动。
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
		TestUtil.run("transaction/declarative/annotation/book_annotation.xml");
	}
}
