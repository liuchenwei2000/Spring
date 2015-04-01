/**
 * 
 */
package resource.spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import resource.IOUtil;

/**
 * 在Spring中访问资源示例
 * <p>
 * 当Spring应用需要进行资源访问时，实际上并不需要直接使用Resource实现类，而是调用ResourceLoader实例的getResource()方法来获得资源。
 * ResourceLoader将会负责选择Resource的实现类，也就是确定具体的资源访问策略，从而将应用程序与具体的资源访问策略分离开来。
 * <p>
 * 而ApplicationContext就是ResourceLoader接口的实现类，当通过ApplicationContext
 * 实例获取Resource实例时，默认采用与ApplicationContext相同的资源访问策略。
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
		// ApplicationContext实例是通过 ClassPathResource加载的
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/cars.xml");
		// 这里获取Resource时默认采用与ApplicationContext实例相同的资源访问策略。
		Resource res = context.getResource("resource/books.xml");
		System.out.println(res.getFilename());
		System.out.println(res.getDescription());
		try {
			IOUtil.print(res.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 使用ApplicationContext访问资源时，也可以不使用其默认的资源访问策略，而是强制使用指定的Resource实现类，这可以通过不同前缀来指定。
		 * 
		 * classpath：强制使用ClassPathResource访问资源。
		 * file：强制使用UrlResource访问本地文件系统资源。
		 * http：强制使用UrlResource访问基于HTTP的网络资源。
		 * 无前缀：使用ApplicationContext默认的Resource实现类访问资源。
		 */
		
		res = context.getResource("file:resources/books.xml");
		System.out.println(res.getFilename());
		System.out.println(res.getDescription());
		try {
			IOUtil.print(res.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
