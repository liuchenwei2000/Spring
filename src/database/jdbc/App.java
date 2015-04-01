/**
 * 
 */
package jdbc;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testTemplate("jdbc/jdbcTemplate.xml");
		testTemplate("jdbc/npJdbcTemplate.xml");
	}

	private static void testTemplate(String xmlFilePath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);

		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");

		System.out.println("保存一个雇员...");
		dao.save(new Employee("Tom", "tom1999@gmail.com", 20));
		dao.save(new Employee("Ann_" + new Date(), "annn@gmail.com", 30));

		System.out.println("更新一个雇员...");
		dao.update(new Employee("Tom", "tom_1999@oracle.com", 20));

		System.out.println("查询一个雇员...");
		System.out.println(dao.find("Tom"));

		System.out.println("删除一个雇员...");
		dao.delete(new Employee("Tom", null, 0));

		((ClassPathXmlApplicationContext) context).close();
	}
}
