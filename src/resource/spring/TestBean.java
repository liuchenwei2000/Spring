/**
 * 
 */
package resource.spring;

import java.io.IOException;

import org.springframework.core.io.Resource;

import resource.IOUtil;

/**
 * 需要访问资源的Bean示例
 * <p>
 * 当应用程序中的Bean实例需要访问资源时，除了使用Resource实现类或ApplicationContext获取资源外，
 * Spring还可以直接利用依赖注入来达到目的。这样允许动态配置资源文件位置，无需将资源文件位置写在代码中。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
 */
public class TestBean {

	// 依赖注入的资源
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
