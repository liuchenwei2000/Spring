/**
 * 
 */
package postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// ��������������Ϊ��ͨBean�����������У����ʹ��ApplicationContext��Ϊ�������������Զ�����BeanFactoryPostProcessor������Spring������
		// ���ʹ��BeanFactory��Ϊ������������ֶ�����BeanFactoryPostProcessor������Spring������
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor/bean.xml");
		context.getBean("car");

		((ClassPathXmlApplicationContext) context).close();
	}
}
