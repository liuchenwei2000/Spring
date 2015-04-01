/**
 * 
 */
package resource;

import org.springframework.core.io.UrlResource;

import resource.IOUtil;

/**
 * UrlResource示例
 * <p>
 * UrlResource是java.net.URL类的包装，主要用于访问通过URL类访问的资源对象。
 * URL资源通常应该提供标准的协议前缀。如下：
 * <li>file：用于访问文件系统。（虽然UrlResource是为访问网络资源设计的，但也可以访问本地磁盘资源。）
 * <li>http：用于通过HTTP协议访问资源。
 * <li>ftp：用于通过FTP协议访问资源。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
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
