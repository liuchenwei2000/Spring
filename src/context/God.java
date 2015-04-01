/**
 * 
 */
package context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 拥有访问Spring容器能力的Bean示例
 * <p>
 * 容器中的Bean可能需要主动访问Spring容器本身，实现BeanFactoryAware接口的Bean会拥有访问BeanFactory容器的能力。
 * 同理，实现ApplicationContextAware接口的Bean能够访问ApplicationContext。
 * <p>
 * 实现接口让Bean拥有了访问容器的能力，但污染了代码，导致代码与Spring接口耦合在一起。
 * 因此，如果不是特别必要，建议不要直接访问容器。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
 */
public class God implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	/**
	 * 这个方法将由Spring调用，Spring调用该方法时会将Spring容器作为参数传入该方法。
	 * <p>
	 * 方法参数applicationContext指向创建它的ApplicationContext实例。
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
