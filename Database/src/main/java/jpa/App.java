/**
 * 
 */
package jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jpa/jpa-context.xml");

		BookDao dao = (BookDao) context.getBean("bookDao");

		System.out.println("保存...");
		dao.save(new Book("Thinking in Java", "Bruce Eckel"));

		System.out.println("查询...");
		Book book = dao.find(1L);
		System.out.println(book);

		System.out.println("删除...");
		dao.delete(book);
	}
}
