/**
 * 
 */
package resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.springframework.core.io.Resource;

/**
 * Resource�ӿ�ʵ��ʾ��
 * <p>
 * Resource������һ���ӿڣ��Ǿ�����Դ���ʲ��Եĳ���Ҳ��������Դ��������ʵ�ֵĽӿڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class ResourceImpl implements Resource {

	/**
	 * ��λ������Դ��������Դ��Ӧ����������
	 * 
	 * @see org.springframework.core.io.InputStreamSource#getInputStream()
	 */
	@Override
	public InputStream getInputStream() throws IOException {
		return null;
	}

	/**
	 * ����Resource��ָ�����Դ�Ƿ���ڡ�
	 * 
	 * @see org.springframework.core.io.Resource#exists()
	 */
	@Override
	public boolean exists() {
		return false;
	}

	/**
	 * ������Դ�ļ��Ƿ�򿪡�
	 * 
	 * @see org.springframework.core.io.Resource#isOpen()
	 */
	@Override
	public boolean isOpen() {
		return false;
	}
	
	/**
	 * ������Դ��������Ϣ��ͬ����Դ�������ʱ�������Ϣ��ͨ����ȫ�޶��ļ�����ʵ��URL��
	 * 
	 * @see org.springframework.core.io.Resource#getDescription()
	 */
	@Override
	public String getDescription() {
		return null;
	}

	/**
	 * ������Դ��Ӧ��URL����
	 * 
	 * @see org.springframework.core.io.Resource#getURL()
	 */
	@Override
	public URL getURL() throws IOException {
		return null;
	}
	
	/**
	 * ������Դ��Ӧ��File����
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
