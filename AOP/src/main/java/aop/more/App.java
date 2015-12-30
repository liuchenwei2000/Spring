/**
 * 
 */
package aop.more;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/more/bean.xml");
		
		Pojo pojo = (Pojo) context.getBean("pojo");
		pojo.foo();
		pojo.bar();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
