/**
 * 
 */
package transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Transaction 部分测试工具
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月5日
 */
public class TestUtil {

	/**
	 * 使用指定XML配置文件进行测试
	 */
	public static void run(String xmlFilePath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);

		BookDao dao = (BookDao) context.getBean("bookDao");

		dao.deleteAll();
		
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println("保存书籍...");
		dao.save(new Book("1", "Thinking in Java_" + date, "Eckel Bruce"));
		dao.save(new Book("2", "Spring in Action_" + date, "Craig Walls"));

		System.out.println("查询书籍...");
		System.out.println(dao.find("Thinking in Java_" + date));
		
		dao.save(new Book("3", "Thinking in Java_" + date, "Bruce Eckel"));
	}
}
