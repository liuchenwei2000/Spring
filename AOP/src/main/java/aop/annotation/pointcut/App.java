/**
 * 
 */
package aop.annotation.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/annotation/pointcut/bean.xml");
		
		MockDAO dao = (MockDAO) context.getBean("dao");
		dao.addString("hello world");
		dao.addInteger(11);
		dao.close();
	}
}
