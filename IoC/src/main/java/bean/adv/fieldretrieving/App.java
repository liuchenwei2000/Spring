/**
 * 
 */
package bean.adv.fieldretrieving;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注入其他Bean的Field值示例
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
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/adv/fieldretrieving/fieldretrieving.xml");

		System.out.println("child1=" + context.getBean("child1"));
		System.out.println("theAge=" + context.getBean("theAge"));
		System.out.println("staticAge=" + context.getBean("staticAge"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
