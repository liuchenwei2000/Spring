/**
 * 
 */
package context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 拥有访问 Spring 容器能力的 Bean 示例
 * <p>
 * 容器中的 Bean 可能需要主动访问 Spring 容器本身，实现 BeanFactoryAware 接口的 Bean 会拥有访问 BeanFactory 容器的能力。
 * 同理，实现 ApplicationContextAware 接口的 Bean 能够访问 ApplicationContext。
 * <p>
 * 实现接口让 Bean 拥有了访问容器的能力，但污染了代码，导致代码与Spring接口耦合在一起。
 * 因此，如果不是特别必要，建议不要直接访问容器。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
 */
public class God implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	/**
	 * 这个方法将由 Spring 调用，Spring 调用该方法时会将 Spring 容器作为参数传入该方法。
	 * 
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getContext(){
		return applicationContext;
	} 
}
