/**
 * 
 */
package context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * �����¼�������ʾ��
 * <p>
 * ͨ��ApplicationEvent���ApplicationListener�ӿڣ�����ʵ��ApplicationContext���¼�����
 * �����������һ��ApplicationListener Bean��ÿ��ApplicationContext����ApplicationEventʱ��ApplicationListener���Զ���֪ͨ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��13��
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context/event/listener.xml");
		
		System.out.println("After context loading......");
		// �¼�Դ��ApplicationContext���¼�������Java������ʽ������
		context.publishEvent(new MyEvent("my event", "Hello world."));
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
