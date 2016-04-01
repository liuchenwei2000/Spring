/**
 * 
 */
package bean.other;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 知道自己 ID 的 Bean 示例
 * <p>
 * 一般情况下，程序总是通过 Bean id 主动来获取 Bean 实例。
 * 但在某些情况下，Bean 自身又需要获取配置该 Bean 时指定的 id 属性。
 * 此时可以通过实现 BeanNameAware 接口，允许 Bean 类获取部署它时的 id 属性。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
 */
public class BeanWhoKnowsID implements BeanNameAware {

	private String id;

	/**
	 * 该方法不是由程序员来调用，而是由 Spring 容器负责调用，容器会把部署该 Bean 的 id 属性作为参数传入。
	 * <p>
	 * Spring 容器会在 Bean 初始化完成后回调该方法————这里的初始化指的是 Bean 的初始化行为：
	 * 包括回调 InitializingBean 接口所实现的 afterPropertiesSet 方法、回调 Bean 配置中 init-method 属性所指定的方法。
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
