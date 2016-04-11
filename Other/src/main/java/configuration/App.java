/**
 * 
 */
package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration/placeholder.xml");
		
		System.out.println("dataSource=" + context.getBean("dataSource"));
	}
}
