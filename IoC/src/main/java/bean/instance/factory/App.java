/**
 * 
 */
package bean.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/instance/factory/factory.xml");
		
		IBeing dog = (IBeing) context.getBean("dog");
		dog.about();
		
		IBeing cat = (IBeing) context.getBean("cat");
		cat.about();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
