/**
 * 
 */
package resource;

import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * Resource 接口实现示例
 * <p>
 * Resource 本身是一个接口，是具体资源访问策略的抽象，也是所有资源访问类所实现的接口。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
 */
public class ResourceImpl implements Resource {

	/**
	 * 定位并打开资源，返回资源对应的输入流。
	 * 
	 * @see org.springframework.core.io.InputStreamSource#getInputStream()
	 */
	@Override
	public InputStream getInputStream() throws IOException {
		return null;
	}

	/**
	 * 返回 Resource 所指向的资源是否存在。
	 * 
	 * @see org.springframework.core.io.Resource#exists()
	 */
	@Override
	public boolean exists() {
		return false;
	}

	/**
	 * 返回资源文件是否打开。
	 * 
	 * @see org.springframework.core.io.Resource#isOpen()
	 */
	@Override
	public boolean isOpen() {
		return false;
	}
	
	/**
	 * 返回资源的描述信息，同于资源处理出错时输出该信息，通常是全限定文件名或实际 URL。
	 * 
	 * @see org.springframework.core.io.Resource#getDescription()
	 */
	@Override
	public String getDescription() {
		return null;
	}

	/**
	 * 返回资源对应的 URL 对象。
	 * 
	 * @see org.springframework.core.io.Resource#getURL()
	 */
	@Override
	public URL getURL() throws IOException {
		return null;
	}
	
	/**
	 * 返回资源对应的 File 对象。
	 * 
	 * @see org.springframework.core.io.Resource#getFile()
	 */
	@Override
	public File getFile() throws IOException {
		return null;
	}

	@Override
	public URI getURI() throws IOException {
		return null;
	}

	@Override
	public long contentLength() throws IOException {
		return 0;
	}

	@Override
	public long lastModified() throws IOException {
		return 0;
	}

	@Override
	public Resource createRelative(String relativePath) throws IOException {
		return null;
	}

	@Override
	public String getFilename() {
		return null;
	}

	@Override
	public boolean isReadable() {
		return false;
	}
}
