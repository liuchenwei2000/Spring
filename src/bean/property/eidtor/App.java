/**
 * 
 */
package bean.property.eidtor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ʾ��
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��29��
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("propertyeidtor/contacts.xml");
		Contact contact = (Contact) context.getBean("vic");
		System.out.println(contact.getPhoneNumber().getAreacode());
		System.out.println(contact.getPhoneNumber().getPhoneno());
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
