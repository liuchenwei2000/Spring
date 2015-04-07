/**
 * 
 */
package bean.other;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 知道自己ID的Bean示例
 * <p>
 * 一般情况下，程序总是通过Bean id主动来获取Bean实例。
 * 但在某些情况下，Bean自身又需要获取配置该Bean时指定的id属性。
 * 此时可以通过实现BeanNameAware接口，允许Bean类获取部署它时的id属性。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
 */
public class BeanWhoKnowsID implements BeanNameAware {

	private String id;

	/**
	 * 该方法不是由程序员来调用，而是由Spring容器负责调用，容器会把部署该Bean的id属性作为参数传入。
	 * <p>
	 * Spring容器会在Bean初始化完成后回调该方法————这里的初始化指的是Bean的初始化行为：
	 * 包括回调InitializingBean接口所实现的afterPropertiesSet方法、回调Bean配置中init-method属性所指定的方法。
	 * 
	 * @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	 */
	@Override
	public void setBeanName(String name) {
		this.id = name;
	}

	public void showID() {
		System.out.println("I know that my id is " + id);
	}
}
