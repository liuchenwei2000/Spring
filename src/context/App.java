/**
 * 
 */
package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context/aware.xml");
		
		God bean = (God) context.getBean("God");
		System.out.println(bean.getContext());
		// �ɼ� ApplicationContext ʵ����ͬһ��
		System.out.println(bean.getContext() == context);
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
