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
		// singleton �������Bean��ÿ�η��صĶ���ͬһ��ʵ��
		System.out.println(context.getBean("singleton") == context.getBean("singleton"));
		// prototype �������Bean��ÿ�η��صĶ���ȫ��ʵ��
		System.out.println(context.getBean("prototype") == context.getBean("prototype"));
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
