/**
 * 
 */
package postprocessor.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 如果采用 ApplicationContext 作为 Spring 容器，则无需手动注册 Bean 后处理器，它会自动检测到容器中的 Bean 后处理器。
		// 如果使用 BeanFactory 作为容器，就需要手动注册Bean后处理器。
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor/bean/mybean.xml");
		System.out.println(context.getBean("mybean"));
	}
}
