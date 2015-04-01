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
 * ��Spring�з�����Դʾ��
 * <p>
 * ��SpringӦ����Ҫ������Դ����ʱ��ʵ���ϲ�����Ҫֱ��ʹ��Resourceʵ���࣬���ǵ���ResourceLoaderʵ����getResource()�����������Դ��
 * ResourceLoader���Ḻ��ѡ��Resource��ʵ���࣬Ҳ����ȷ���������Դ���ʲ��ԣ��Ӷ���Ӧ�ó�����������Դ���ʲ��Է��뿪����
 * <p>
 * ��ApplicationContext����ResourceLoader�ӿڵ�ʵ���࣬��ͨ��ApplicationContext
 * ʵ����ȡResourceʵ��ʱ��Ĭ�ϲ�����ApplicationContext��ͬ����Դ���ʲ��ԡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class ResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ApplicationContextʵ����ͨ�� ClassPathResource���ص�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean/cars.xml");
		// �����ȡResourceʱĬ�ϲ�����ApplicationContextʵ����ͬ����Դ���ʲ��ԡ�
		Resource res = context.getResource("resource/books.xml");
		System.out.println(res.getFilename());
		System.out.println(res.getDescription());
		try {
			IOUtil.print(res.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * ʹ��ApplicationContext������Դʱ��Ҳ���Բ�ʹ����Ĭ�ϵ���Դ���ʲ��ԣ�����ǿ��ʹ��ָ����Resourceʵ���࣬�����ͨ����ͬǰ׺��ָ����
		 * 
		 * classpath��ǿ��ʹ��ClassPathResource������Դ��
		 * file��ǿ��ʹ��UrlResource���ʱ����ļ�ϵͳ��Դ��
		 * http��ǿ��ʹ��UrlResource���ʻ���HTTP��������Դ��
		 * ��ǰ׺��ʹ��ApplicationContextĬ�ϵ�Resourceʵ���������Դ��
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
