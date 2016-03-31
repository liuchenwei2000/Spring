/**
 * 
 */
package autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Walkman;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("【byName】");
		run("autowiring/xml/byName.xml");
		System.out.println("【byType】");
		run("autowiring/xml/byType.xml");
		System.out.println("【constructor】");
		run("autowiring/xml/constructor.xml");
	}

	private static void run(String xmlFilePath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);
		Walkman walkman = (Walkman) context.getBean("walkman");
		walkman.start();
	}
}
