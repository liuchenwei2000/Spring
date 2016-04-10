/**
 * 
 */
package util;

import bean.alias.Car;
import context.God;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("util/mybeans.xml");
		
		Car car1 = (Car) context.getBean("car");
        Car car2 = new CarStore().getCar();

		// 可见 Car 实例是同一个
		System.out.println(car1 == car2);
	}
}
