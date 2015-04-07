/**
 * 
 */
package resource.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring/testbean.xml");
		
		System.out.println("Resource by file:");
		TestBean byFile = (TestBean) context.getBean("byFile");
		byFile.parse();
		
		System.out.println("Resource by classpath:");
		TestBean byClasspath = (TestBean) context.getBean("byClasspath");
		byClasspath.parse();

		((ClassPathXmlApplicationContext) context).close();
	}
}
