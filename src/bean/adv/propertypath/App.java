/**
 * 
 */
package bean.adv.propertypath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ע������Bean������ֵʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��20��
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/adv/propertypath/propertypath.xml");

		System.out.println("son1=" + context.getBean("son1"));
		System.out.println("son2=" + context.getBean("son2"));
		System.out.println("theAge=" + context.getBean("theAge"));
		System.out.println("newAge=" + context.getBean("newAge"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
