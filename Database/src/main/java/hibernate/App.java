/**
 * 
 */
package hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate/hibernateTemplate.xml");

		PersonDao dao = (PersonDao) context.getBean("personDao");

		System.out.println("保存一个人...");
		dao.save(new Person("Tom", "tom1999@gmail.com", 20));
		dao.save(new Person("Ann_" + new Date(), "annn@gmail.com", 30));

		System.out.println("更新一个人...");
		dao.update(new Person("Tom", "tom_1999@oracle.com", 20));

		System.out.println("查询一个人...");
		Person person = dao.find(1L);
		System.out.println(person);

		System.out.println("删除一个人...");
		dao.delete(person);
	}
}
