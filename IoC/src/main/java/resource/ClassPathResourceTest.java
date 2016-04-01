/**
 * 
 */
package resource;

import org.springframework.core.io.ClassPathResource;

/**
 * ClassPathResource 示例
 * <p>
 * ClassPathResource 用来访问类加载路径下的资源，其主要优势是方便访问类加载路径里的资源，
 * 尤其对于 Web 应用，ClassPathResource 可自动搜索位于 WEB-INF/classes 下的资源文件，无需使用绝对路径访问。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
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
