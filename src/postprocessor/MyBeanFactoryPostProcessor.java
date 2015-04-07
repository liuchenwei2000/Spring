/**
 * 
 */
package postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 容器后处理器示例
 * <p>
 * Bean后处理器负责处理容器中的所有Bean实例，而容器后处理器则负责处理容器本身。
 * 容器后处理器通常用于对Spring容器进行处理，并且总是在容器实例化任何其他的Bean之前读取配置文件的元数据，并有可能修改这些元数据。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月21日
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/**
	 * 实现该方法对Spring容器进行处理
	 * 
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Spring 容器是 " + beanFactory);
	}
}
