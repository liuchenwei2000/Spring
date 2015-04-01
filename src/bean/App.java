/**
 * 
 */
package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/cars.xml");
		
		// ͨ�� Bean id��name��alias �����Ի�ȡ Bean ʵ��
		System.out.println("car=" + context.getBean("car"));
		System.out.println("mycar=" + context.getBean("mycar"));
		System.out.println("mydear=" + context.getBean("mydear"));
		System.out.println("horse=" + context.getBean("horse"));
		System.out.println("car1=" + context.getBean("car1"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
