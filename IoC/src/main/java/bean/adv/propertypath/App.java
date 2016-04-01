/**
 * 
 */
package bean.adv.propertypath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注入其他Bean的属性值示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月20日
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/adv/propertypath/propertypath.xml");

		System.out.println("son1=" + context.getBean("son1"));
		System.out.println("son2=" + context.getBean("son2"));
		System.out.println("theAge=" + context.getBean("theAge"));
		System.out.println("newAge=" + context.getBean("newAge"));
	}
}
