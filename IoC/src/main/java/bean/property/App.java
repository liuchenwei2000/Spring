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

		System.out.println("array：" + Arrays.toString(bean.getArray()));
		System.out.println("list：" + bean.getList());
		System.out.println("list_cars：" + bean.getCars());
		System.out.println("set：" + bean.getSet());
		System.out.println("map：" + bean.getMap());
		System.out.println("map_cars：" + bean.getCarMap());
		System.out.println("prop：" + bean.getProperties());

		((ClassPathXmlApplicationContext) context).close();
	}
}
