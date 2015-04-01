/**
 * 
 */
package bean.property;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/property/collectionProperty.xml");
		
		Bean bean = (Bean) context.getBean("bean");

		System.out.println("array£º" + Arrays.toString(bean.getArray()));
		System.out.println("list£º" + bean.getList());
		System.out.println("list_cars£º" + bean.getCars());
		System.out.println("set£º" + bean.getSet());
		System.out.println("map£º" + bean.getMap());
		System.out.println("map_cars£º" + bean.getCarMap());
		System.out.println("prop£º" + bean.getProperties());

		((ClassPathXmlApplicationContext) context).close();
	}
}
