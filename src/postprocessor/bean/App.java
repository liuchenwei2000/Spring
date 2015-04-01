/**
 * 
 */
package postprocessor.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 如果采用ApplicationContext作为Spring容器，则无需手动注册Bean后处理器，它会自动检测到容器中的Bean后处理器。
		// 如果使用BeanFactory作为容器，就需要手动注册Bean后处理器。
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor/bean/mybean.xml");
		context.getBean("mybean");

		((ClassPathXmlApplicationContext) context).close();
	}
}
