/**
 * 
 */
package bean.abstracts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/abstracts/absbean.xml");

		Televison child1 = (Televison) context.getBean("child1");
		System.out.println("child1=" + child1.getName());

		Computer child2 = (Computer) context.getBean("child2");
		System.out.println("child2=" + child2.getName());

		IConfigurable child3 = (IConfigurable) context.getBean("child3");
		System.out.println("child3=" + child3.getContent());
	}
}
