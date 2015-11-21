/**
 * 
 */
package context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 容器事件监听器示例
 * <p>
 * 通过ApplicationEvent类和ApplicationListener接口，可以实现ApplicationContext的事件处理。
 * 如果容器中有一个ApplicationListener Bean，每当ApplicationContext发布ApplicationEvent时，ApplicationListener将自动被通知。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context/event/listener.xml");
		
		System.out.println("After context loading......");
		// 事件源是ApplicationContext，事件必须由Java程序显式触发。
		context.publishEvent(new MyEvent("my event", "Hello world."));
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
