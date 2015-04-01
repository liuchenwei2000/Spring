/**
 * 
 */
package bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import quickstart.Walkman;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("¡¾byName¡¿");
		run("bean/autowire/byName.xml");
		System.out.println("¡¾byType¡¿");
		run("bean/autowire/byType.xml");
		System.out.println("¡¾constructor¡¿");
		run("bean/autowire/constructor.xml");
	}

	private static void run(String xmlFilePath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);
		Walkman walkman = (Walkman) context.getBean("walkman");
		walkman.start();

		((ClassPathXmlApplicationContext) context).close();
	}
}
