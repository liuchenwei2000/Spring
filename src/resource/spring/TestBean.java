/**
 * 
 */
package resource.spring;

import java.io.IOException;

import org.springframework.core.io.Resource;

import resource.IOUtil;

/**
 * ��Ҫ������Դ��Beanʾ��
 * <p>
 * ��Ӧ�ó����е�Beanʵ����Ҫ������Դʱ������ʹ��Resourceʵ�����ApplicationContext��ȡ��Դ�⣬
 * Spring������ֱ����������ע�����ﵽĿ�ġ���������̬������Դ�ļ�λ�ã����轫��Դ�ļ�λ��д�ڴ����С�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��23��
 */
public class TestBean {

	// ����ע�����Դ
	private Resource resource;

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public void parse(){
		System.out.println(resource.getFilename());
		System.out.println(resource.getDescription());
		try {
			IOUtil.print(resource.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
