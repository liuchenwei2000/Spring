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
		// ͨ��ͬʱ���ض��XML�����ļ��ķ�ʽ���������Ϣ
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "bean/imports/dao.xml", "bean/imports/business.xml" });

		DAO dao = (DAO) context.getBean("dao");
		
		BusinessLayer business = (BusinessLayer) context.getBean("business");
		business.setDao(dao);// �ֶ�Ϊ BusinessLayer ���� DAO ����
		business.doOperation();
		
		((ClassPathXmlApplicationContext) context).close();
		
		// ͨ����XML�����ļ���ʹ�� import �ķ�ʽ���������Ϣ
		context = new ClassPathXmlApplicationContext("bean/imports/business2.xml");

		business = (BusinessLayer) context.getBean("business");
		business.doOperation();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
