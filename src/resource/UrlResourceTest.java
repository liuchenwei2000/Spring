/**
 * 
 */
package resource;

import org.springframework.core.io.UrlResource;

import resource.IOUtil;

/**
 * UrlResourceʾ��
 * <p>
 * UrlResource��java.net.URL��İ�װ����Ҫ���ڷ���ͨ��URL����ʵ���Դ����
 * URL��Դͨ��Ӧ���ṩ��׼��Э��ǰ׺�����£�
 * <li>file�����ڷ����ļ�ϵͳ������ȻUrlResource��Ϊ����������Դ��Ƶģ���Ҳ���Է��ʱ��ش�����Դ����
 * <li>http������ͨ��HTTPЭ�������Դ��
 * <li>ftp������ͨ��FTPЭ�������Դ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class UrlResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UrlResource res = new UrlResource("file:resources/books.xml");
			System.out.println(res.getFilename());
			System.out.println(res.getDescription());
			IOUtil.print(res.getFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
