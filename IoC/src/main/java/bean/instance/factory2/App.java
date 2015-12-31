/**
 * 
 */
package bean.instance.factory2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/instance/factory2/factory.xml");
		
		IPerson am = (IPerson) context.getBean("american");
		am.sayHello();
		
		IPerson ch = (IPerson) context.getBean("chinese");
		ch.sayHello();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
