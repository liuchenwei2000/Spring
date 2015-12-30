/**
 * 
 */
package aop.xml.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Bean;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/xml/pointcut/bean.xml");
		
		Bean bean = (Bean) context.getBean("abean");
		bean.sayHello();
		System.out.println();
		
		bean.goodbye();
		System.out.println();
		
		bean.calculateWithoutException();
		System.out.println();
		

		bean.call1();
		bean.call3("110");
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
