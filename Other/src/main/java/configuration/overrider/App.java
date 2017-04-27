/**
 * 
 */
package configuration.overrider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration/overrider/overrider.xml");
		
		System.out.println("dataSource=" + context.getBean("dataSource"));
	}
}
