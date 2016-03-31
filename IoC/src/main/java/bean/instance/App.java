/**
 * 
 */
package bean.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/instance/read.xml");
		
		System.out.printf("reader=%s", context.getBean("reader"));
	}
}
