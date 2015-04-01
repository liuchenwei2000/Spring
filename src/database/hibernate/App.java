/**
 * 
 */
package hibernate;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate/hibernateTemplate.xml");

		PersonDao dao = (PersonDao) context.getBean("personDao");

		System.out.println("����һ����...");
		dao.save(new Person("Tom", "tom1999@gmail.com", 20));
		dao.save(new Person("Ann_" + new Date(), "annn@gmail.com", 30));

		System.out.println("����һ����...");
		dao.update(new Person("Tom", "tom_1999@oracle.com", 20));

		System.out.println("��ѯһ����...");
		Person person = dao.find(1L);
		System.out.println(person);

		System.out.println("ɾ��һ����...");
		dao.delete(person);

		((ClassPathXmlApplicationContext) context).close();
	}
}
