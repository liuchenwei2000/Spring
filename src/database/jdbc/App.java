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

		System.out.println("����һ����Ա...");
		dao.save(new Employee("Tom", "tom1999@gmail.com", 20));
		dao.save(new Employee("Ann_" + new Date(), "annn@gmail.com", 30));

		System.out.println("����һ����Ա...");
		dao.update(new Employee("Tom", "tom_1999@oracle.com", 20));

		System.out.println("��ѯһ����Ա...");
		System.out.println(dao.find("Tom"));

		System.out.println("ɾ��һ����Ա...");
		dao.delete(new Employee("Tom", null, 0));

		((ClassPathXmlApplicationContext) context).close();
	}
}
