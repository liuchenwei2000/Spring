/**
 * 
 */
package autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/annotation/autowired.xml");
		Bean bean = (Bean) context.getBean("bean");
		System.out.println(bean);

		context = new ClassPathXmlApplicationContext("autowiring/annotation/autowired2.xml");
		BeanAdv beanAdv = (BeanAdv) context.getBean("bean");
		System.out.println(beanAdv);
	}
}
