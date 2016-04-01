/**
 * 
 */
package autowiring.autodiscovery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/autodiscovery/BeanAutoScan.xml");
		Bean bean = (Bean) context.getBean("bean");
		System.out.println(bean);
	}
}
