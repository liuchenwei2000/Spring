/**
 * 
 */
package postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 将容器后处理器作为普通 Bean 部署在容器中，如果使用 ApplicationContext 作为容器，
		// 容器会自动调用 BeanFactoryPostProcessor 来处理 Spring 容器；
		// 如果使用 BeanFactory 作为容器，则必须手动调用 BeanFactoryPostProcessor 来处理 Spring 容器。
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor/bean.xml");
		System.out.println(context.getBean("car"));
	}
}
