/**
 * 
 */
package bean.other;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/other/beans.xml");
		
		BeanWhoKnowsID bean = (BeanWhoKnowsID) context.getBean("bean1");
		bean.showID();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
