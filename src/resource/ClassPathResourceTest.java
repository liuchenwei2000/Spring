/**
 * 
 */
package resource;

import org.springframework.core.io.ClassPathResource;

/**
 * ClassPathResourceʾ��
 * <p>
 * ClassPathResource�������������·���µ���Դ������Ҫ�����Ƿ�����������·�������Դ��
 * �������WebӦ�ã�ClassPathResource���Զ�����λ��WEB-INF/classes�µ���Դ�ļ�������ʹ�þ���·�����ʡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class ClassPathResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ClassPathResource urlRes = new ClassPathResource("resource/books.xml");
			System.out.println(urlRes.getFilename());
			System.out.println(urlRes.getDescription());
			IOUtil.print(urlRes.getFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
