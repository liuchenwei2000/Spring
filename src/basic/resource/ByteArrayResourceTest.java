/**
 * 
 */
package resource;

import org.springframework.core.io.ByteArrayResource;

/**
 * ByteArrayResource示例
 * <p>
 * ByteArrayResource类用来读取字节数组资源。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
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
