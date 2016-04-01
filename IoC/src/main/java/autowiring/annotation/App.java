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
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/annotation/BeanAutowired.xml");
		BeanAutowired bean = (BeanAutowired) context.getBean("bean");
		System.out.println(bean);

		context = new ClassPathXmlApplicationContext("autowiring/annotation/BeanQualifier.xml");
		BeanQualifier bean2 = (BeanQualifier) context.getBean("bean");
		System.out.println(bean2);

		context = new ClassPathXmlApplicationContext("autowiring/annotation/BeanResource.xml");
		BeanResource beanJSR = (BeanResource) context.getBean("bean");
		System.out.println(beanJSR);
	}
}
