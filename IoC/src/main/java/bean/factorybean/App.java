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
		
		// 通过getBean()方法来获取实例时，容器返回的是该 FactoryBean 的产品而不是 FactoryBean 本身。
		IPerson person = (IPerson) context.getBean("person");
		person.sayHello();
		
		// 如果需要获取 FactoryBean 本身，则应该在 bean id 前加上 &
		PersonFactoryBean factory = (PersonFactoryBean) context.getBean("&person");
		System.out.println(factory.getClass());
	}
}
