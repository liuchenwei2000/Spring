/**
 * 
 */
package postprocessor.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"postprocessor/placeholder/datasource.xml");
		DataSource ds = (DataSource) context.getBean("datasource");
		System.out.println(ds);
	}
}
