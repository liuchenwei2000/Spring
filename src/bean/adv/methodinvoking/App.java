/**
 * 
 */
package bean.adv.methodinvoking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ע������Bean�ķ�������ֵʾ��
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
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/adv/methodinvoking/methodinvoking.xml");

		Values values = (Values) context.getBean("values");
		System.out.println("values.value1=" + values.getValue1());
		System.out.println("values.value2=" + values.getValue2());
		System.out.println("theString=" + context.getBean("theString"));
		System.out.println("theParamString=" + context.getBean("theParamString"));
		System.out.println("theStaticString=" + context.getBean("theStaticString"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
