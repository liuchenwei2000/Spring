/**
 * 
 */
package postprocessor.propertyoverride;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"postprocessor/propertyoverride/datasource.xml");
		DataSource ds = (DataSource) context.getBean("datasource");
		System.out.println(ds);

		((ClassPathXmlApplicationContext) context).close();
	}
}
