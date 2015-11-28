/**
 * 
 */
package quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 主程序运行类
 * <p>
 * Spring容器是生成Bean实例的工厂，负责创建Bean实例，并管理其生命周期。
 * Bean是Spring管理的基本单位，在基于Spring的JavaEE应用中，所有的组件都被当成Bean处理，
 * 包括数据源、Hibernate的SessionFactory、事务管理器等。
 * 这里的Bean是广义的概念，可以是POJO而不仅仅是标准的JavaBean。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年10月26日
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runAsNormal();
		runUsingSpring();
	}

	private static void runAsNormal() {
		System.out.println("【runAsNormal】");
		
		Walkman walkman = new Walkman("sony");
		walkman.setTape(new Tape());
		walkman.start();
	}

	private static void runUsingSpring() {
		System.out.println("【runUsingSpring】");
		
		/*
		 * Spring容器最基本的接口是BeanFactory，负责配置、创建、管理Bean。
		 * 调用者只需使用getBean方法即可获得指定Bean的实例，无需关心Bean的实例化过程。
		 * 它的子接口ApplicationContext被称为Spring上下文，对于大部分应用而言，使用它作为Spring容器更方便。
		 * 
		 * ApplicationContext的常用实现类有：
		 * FileSystemXmlApplicationContext：以基于文件系统的XML配置文件创建ApplicationContext实例。
		 * ClassPathXmlApplicationContext：以classpath（类路径）下的XML配置文件创建ApplicationContext实例。
		 * AnnotationConfigApplicationContext、XmlWebApplicationContext、 AnnotationConfigWebApplicationContext。
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("quickstart/beans.xml");
		// Walkman 实例的属性值并不是程序主动设置的，而是由Spring容器来负责注入的。
		// 通过 Bean id 来获取对应的实例
		Walkman walkman = (Walkman) context.getBean("walkman");
		walkman.start();

		((ClassPathXmlApplicationContext) context).close();
	}
}
