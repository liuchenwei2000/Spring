/**
 * 
 */
package bean.lifecycle.destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/lifecycle/destroy/order.xml");
		
		context.getBean("order");
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
