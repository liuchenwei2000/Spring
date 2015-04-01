/**
 * 
 */
package resource;

import org.springframework.core.io.ByteArrayResource;

/**
 * ByteArrayResourceʾ��
 * <p>
 * ByteArrayResource��������ȡ�ֽ�������Դ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class ByteArrayResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ByteArrayResource res = new ByteArrayResource("This is a string".getBytes());
			System.out.println(res.getFilename());
			System.out.println(res.getDescription());
			IOUtil.print(res.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
