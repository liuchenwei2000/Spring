/**
 * 
 */
package quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ������������
 * <p>
 * Spring����������Beanʵ���Ĺ��������𴴽�Beanʵ�������������������ڡ�
 * Bean��Spring����Ļ�����λ���ڻ���Spring��JavaEEӦ���У����е������������Bean����
 * ��������Դ��Hibernate��SessionFactory������������ȡ�
 * �����Bean�ǹ���ĸ��������POJO���������Ǳ�׼��JavaBean��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��26��
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runAsNormal();
		runUsingSpring();
	}

	private static void runAsNormal() {
		System.out.println("��runAsNormal��");
		
		Walkman walkman = new Walkman("sony");
		walkman.setTape(new Tape());
		walkman.start();
	}

	private static void runUsingSpring() {
		System.out.println("��runUsingSpring��");
		
		/*
		 * Spring����������Ľӿ���BeanFactory���������á�����������Bean��
		 * ������ֻ��ʹ��getBean�������ɻ��ָ��Bean��ʵ�����������Bean��ʵ�������̡�
		 * �����ӽӿ�ApplicationContext����ΪSpring�����ģ����ڴ󲿷�Ӧ�ö��ԣ�ʹ������ΪSpring���������㡣
		 * 
		 * ApplicationContext�ĳ���ʵ�����У�
		 * FileSystemXmlApplicationContext���Ի����ļ�ϵͳ��XML�����ļ�����ApplicationContextʵ����
		 * ClassPathXmlApplicationContext����classpath����·�����µ�XML�����ļ�����ApplicationContextʵ����
		 * AnnotationConfigApplicationContext��XmlWebApplicationContext�� AnnotationConfigWebApplicationContext��
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("quickstart/beans.xml");
		// Walkman ʵ��������ֵ�����ǳ����������õģ�������Spring����������ע��ġ�
		// ͨ�� Bean id ����ȡ��Ӧ��ʵ��
		Walkman walkman = (Walkman) context.getBean("walkman");
		walkman.start();

		((ClassPathXmlApplicationContext) context).close();
	}
}
