/**
 * 
 */
package jpa.container;

import jpa.Book;
import jpa.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Container-managed 类型 JPA 使用示例
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jpa/container/jpa-context.xml");

		BookDao dao = (BookDao) context.getBean("bookDao");

		Book book = new Book("Thinking in Java", "Bruce Eckel");

		System.out.println("保存...");
		dao.save(book);
		System.out.println(book.getId());

		System.out.println("查询...");
		book = dao.find(book.getId());
		System.out.println(book);

		System.out.println("删除...");
		dao.delete(book);
	}
}
