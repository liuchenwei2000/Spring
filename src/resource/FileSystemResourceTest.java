/**
 * 
 */
package resource;

import org.springframework.core.io.FileSystemResource;

/**
 * FileSystemResourceʾ��
 * <p>
 * FileSystemResource�����ڷ����ļ�ϵͳ��Դ��ʹ�ø����������ļ���Դ��û��̫�����ƣ���ΪJDK�����ṩ��File/IOҲ�����ڷ���ϵͳ�ļ���Դ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class FileSystemResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileSystemResource res = new FileSystemResource("resources/books.xml");
			System.out.println(res.getFilename());
			System.out.println(res.getDescription());
			IOUtil.print(res.getFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
