/**
 * 
 */
package resource;

import org.springframework.core.io.FileSystemResource;

/**
 * FileSystemResource 示例
 * <p>
 * FileSystemResource 类用于访问文件系统资源，使用该类来访问文件资源并没有太大优势，
 * 因为JDK自身提供的 File/IO 也可用于访问系统文件资源。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
 */
public class FileSystemResourceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileSystemResource res = new FileSystemResource("IoC/src/main/java/resource/books.xml");
			System.out.println(res.getFilename());
			System.out.println(res.getDescription());
			IOUtil.print(res.getFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
