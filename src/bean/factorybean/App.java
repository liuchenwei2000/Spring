/**
 * 
 */
package bean.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.instance.factory2.IPerson;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/factorybean/factorybean.xml");
		
		// ͨ��getBean()��������ȡʵ��ʱ���������ص��Ǹ�FactoryBean�Ĳ�Ʒ������FactoryBean����
		IPerson person = (IPerson) context.getBean("person");
		person.sayHello();
		
		// �����Ҫ��ȡFactoryBean������Ӧ����bean idǰ���� &
		PersonFactoryBean factory = (PersonFactoryBean) context.getBean("&person");
		System.out.println(factory.getClass());
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
