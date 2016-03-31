/**
 * 
 */
package bean.property;

import bean.Walkman;
import bean.alias.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testValues();
		testValues_p();
		testCollectionProperty();
	}

	private static void testValues() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/property/values.xml");

		Car car = (Car) context.getBean("car");
		System.out.println("car：" + car);

		Walkman walkman = (Walkman) context.getBean("walkman");
		System.out.println("walkman：" + walkman);

		Walkman walkman2 = (Walkman) context.getBean("walkman2");
		System.out.println("walkman2：" + walkman2);
	}

	private static void testValues_p() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/property/values_p.xml");

		Car car = (Car) context.getBean("car");
		System.out.println("car：" + car);

		Walkman walkman = (Walkman) context.getBean("walkman");
		System.out.println("walkman：" + walkman);
	}

	private static void testCollectionProperty() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/property/collectionProperty.xml");

		Bean bean = (Bean) context.getBean("bean");

		System.out.println("array：" + Arrays.toString(bean.getArray()));
		System.out.println("list：" + bean.getList());
		System.out.println("list_cars：" + bean.getCars());
		System.out.println("set：" + bean.getSet());
		System.out.println("map：" + bean.getMap());
		System.out.println("map_cars：" + bean.getCarMap());
		System.out.println("prop：" + bean.getProperties());
	}
}
