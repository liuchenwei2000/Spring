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
		// �������ApplicationContext��ΪSpring�������������ֶ�ע��Bean�������������Զ���⵽�����е�Bean��������
		// ���ʹ��BeanFactory��Ϊ����������Ҫ�ֶ�ע��Bean��������
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor/bean/mybean.xml");
		System.out.println(context.getBean("mybean"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
