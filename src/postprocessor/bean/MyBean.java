/**
 * 
 */
package postprocessor.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月20日
 */
public class MyBean implements InitializingBean {

	private String name;

	public MyBean() {
		super();
		System.out.println("创建MyBean实例");
	}
	
	public void init(){
		System.out.println("在init()方法里初始化");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("在afterPropertiesSet()方法里初始化");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}