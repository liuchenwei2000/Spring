/**
 * 
 */
package bean.property.composite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/property/composite/person.xml");
		
		Person person = (Person) context.getBean("person");
		System.out.println(person.getCar().getName());
	}
}
