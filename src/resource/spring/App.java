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
		
		TestBean bean = (TestBean) context.getBean("testbean");
		bean.parse();

		((ClassPathXmlApplicationContext) context).close();
	}
}
