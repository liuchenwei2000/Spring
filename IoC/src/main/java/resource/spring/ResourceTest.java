/**
 * 
 */
package resource.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import resource.IOUtil;

import java.io.IOException;

/**
 * 在 Spring 中访问资源示例
 * <p>
 * 当 Spring 应用需要进行资源访问时，实际上并不需要直接使用 Resource 实现类，
 * 而是调用 ResourceLoader 实例的 getResource() 方法来获得资源。
 *
 * ResourceLoader 将会负责选择 Resource 的实现类，也就是确定具体的资源访问策略，
 * 从而将应用程序与具体的资源访问策略分离开来。
 * <p>
 * 而 ApplicationContext 就是 ResourceLoader 接口的实现类，
 * 当通过 ApplicationContext 实例获取 Resource 实例时，
 * 默认采用与 ApplicationContext 相同的资源访问策略。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
 */
public class ResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ApplicationContext 实例是通过 ClassPathResource 加载的
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/alias/cars.xml");
		// 这里获取 Resource 时默认采用与 ApplicationContext 实例相同的资源访问策略。
		Resource res = context.getResource("resource/books.xml");
		System.out.println(res.getFilename());
		System.out.println(res.getDescription());
		try {
			IOUtil.print(res.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 使用 ApplicationContext 访问资源时，也可以不使用其默认的资源访问策略，
		 * 而是强制使用指定的 Resource 实现类，这可以通过不同前缀来指定。
		 * 
		 * classpath：强制使用 ClassPathResource 访问资源。
		 * file：强制使用 UrlResource 访问本地文件系统资源。
		 * http：强制使用 UrlResource 访问基于 HTTP 的网络资源。
		 * 无前缀：使用 ApplicationContext 默认的 Resource 实现类访问资源。
		 */
		
		res = context.getResource("file:IoC/src/main/java/resource/books.xml");
		System.out.println(res.getFilename());
		System.out.println(res.getDescription());
		try {
			IOUtil.print(res.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
