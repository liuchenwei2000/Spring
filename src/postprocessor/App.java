/**
 * 
 */
package postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 将容器后处理器作为普通Bean部署在容器中，如果使用ApplicationContext作为容器，容器会自动调用BeanFactoryPostProcessor来处理Spring容器；
		// 如果使用BeanFactory作为容器，则必须手动调用BeanFactoryPostProcessor来处理Spring容器。
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor/bean.xml");
		context.getBean("car");

		((ClassPathXmlApplicationContext) context).close();
	}
}
