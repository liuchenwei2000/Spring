/**
 * 
 */
package bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/scope/scope.xml");

		System.out.println(context.getBean("default") == context.getBean("default"));
		// singleton 作用域的Bean，每次返回的都是同一个实例
		System.out.println(context.getBean("singleton") == context.getBean("singleton"));
		// prototype 作用域的Bean，每次返回的都是全新实例
		System.out.println(context.getBean("prototype") == context.getBean("prototype"));
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
