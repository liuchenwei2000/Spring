/**
 * 
 */
package bean.scope.more;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/scope/more/lookup.xml");

		Worker worker1 = (Worker) context.getBean("worker1");
		worker1.produce();
		worker1.produce();
		
		Worker worker2 = (Worker) context.getBean("worker2");
		worker2.produce();
		worker2.produce();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
