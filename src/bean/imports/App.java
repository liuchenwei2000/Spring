/**
 * 
 */
package bean.imports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 通过同时加载多个XML配置文件的方式组合配置信息
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "bean/imports/dao.xml", "bean/imports/business.xml" });

		DAO dao = (DAO) context.getBean("dao");
		
		BusinessLayer business = (BusinessLayer) context.getBean("business");
		business.setDao(dao);// 手动为 BusinessLayer 设置 DAO 对象
		business.doOperation();
		
		((ClassPathXmlApplicationContext) context).close();
		
		// 通过在XML配置文件中使用 import 的方式组合配置信息
		context = new ClassPathXmlApplicationContext("bean/imports/business2.xml");

		business = (BusinessLayer) context.getBean("business");
		business.doOperation();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
