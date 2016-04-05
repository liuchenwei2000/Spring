/**
 * 
 */
package aop.annotation;

import aop.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/annotation/bean.xml");
		
		Bean bean = (Bean) context.getBean("abean");
		bean.sayHello();
		System.out.println();
		
		bean.goodbye();
		System.out.println();
		
		bean.calculateWithoutException();
		System.out.println();
		
		try {
			bean.calculate();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

		bean.call1();
		
		try {
			bean.call2();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		bean.insertString("I'm yours");
		
		bean.eat("noodles", new Date());
		
		bean.register("Tom", 11, '男');
	}
}
