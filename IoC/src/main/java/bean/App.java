/**
 * 
 */
package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 主程序运行类
 * <p>
 * 容器是 Spring 框架的核心，Spring 容器使用依赖注入管理构成应用的组件，它会创建相互协作的组件之间的关联。
 *
 * Spring 容器是生成 Bean 实例的工厂，负责创建 Bean 实例，并管理其生命周期。
 * Bean 是 Spring 管理的基本单位，在基于 Spring 的 JavaEE 应用中，所有的组件都被当成Bean处理，
 * 包括数据源、事务管理器等。这里的 Bean 是广义的概念，可以是 POJO 而不仅仅是标准的 JavaBean。
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

		/* Spring 自带了几种容器实现，主要有
		 *
		 * BeanFactory：是最简单的容器，提供基本的 DI 支持。负责配置、创建、管理Bean。
		 * 调用者只需使用getBean方法即可获得指定Bean的实例，无需关心Bean的实例化过程。
		 *
		 * ApplicationContext：基于 BeanFactory 之上构建，并提供面向应用的服务，
		 * 例如从属性文件解析文本信息的能力，以及发布应用事件给感兴趣的事件监听者的能力。
		 * 对于大部分应用而言，使用它作为 Spring 容器更方便。
		 *
		 *
		 * ApplicationContext 的常用实现类有：
		 *
		 * ClassPathXmlApplicationContext：以classpath（类路径）下的 XML 配置文件创建 ApplicationContext 实例。
		 * FileSystemXmlApplicationContext：以基于文件系统的 XML 配置文件创建 ApplicationContext 实例。
		 * XmlWebApplicationContext：读取 Web 应用下的 XML 配置文件创建 ApplicationContext 实例。
		 * AnnotationConfigApplicationContext：以基于注解的 Java 类创建 ApplicationContext 实例。
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/beans.xml");

		// Walkman 实例的属性值并不是程序主动设置的，而是由Spring容器来负责注入的。
		// 通过 Bean id 来获取对应的实例
		Walkman walkman = (Walkman) context.getBean("walkman");
		walkman.start();
	}
}
