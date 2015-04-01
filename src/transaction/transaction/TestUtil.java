/**
 * 
 */
package transaction;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import transaction.Book;
import transaction.BookDao;

/**
 * Transaction ���ֲ��Թ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��5��
 */
public class TestUtil {

	/**
	 * ʹ��ָ��XML�����ļ����в���
	 */
	public static void run(String xmlFilePath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);

		BookDao dao = (BookDao) context.getBean("bookDao");

		dao.deleteAll();
		
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println("�����鼮...");
		dao.save(new Book("1", "Thinking in Java_" + date, "Eckel Bruce"));
		dao.save(new Book("2", "Spring in Action_" + date, "Craig Walls"));

		System.out.println("��ѯ�鼮...");
		System.out.println(dao.find("Thinking in Java_" + date));
		
		dao.save(new Book("3", "Thinking in Java_" + date, "Bruce Eckel"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
