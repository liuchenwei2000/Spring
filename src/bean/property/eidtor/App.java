/**
 * 
 */
package bean.property.eidtor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/property/eidtor/contacts.xml");
		
		Contact contact = (Contact) context.getBean("vic");
		System.out.println(contact.getPhoneNumber().getAreacode());
		System.out.println(contact.getPhoneNumber().getPhoneno());
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
