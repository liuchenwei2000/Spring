/**
 * 
 */
package postprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Bean 后处理器示例
 * <p>
 * Bean 后处理器是一种特殊的Bean，它并不对外提供服务，甚至无需 id 属性。
 * 它主要负责对容器中的其他 Bean 执行后处理，例如为容器中的目标 Bean 生成代理等。
 * <p>
 * Bean 后处理器会在 Bean 实例创建成功之后，对 Bean 实例进行进一步的增强处理。
 * 它通常用来检查标记接口，或者将 Bean 包装成一个 Proxy，Spring 的很多工具类，就是通过 Bean 后处理器完成的，
 * 比如 BeanNameAutoProxyCreator、DefaultAdvisorAutoProxyCreator。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月20日
 */
public class MyBeanPostProcessor implements BeanPostProcessor {// 需要实现 BeanPostProcessor 接口

	/**
	 * 这个方法会在目标Bean初始化之前被调用。
	 * 
	 * @param bean 待处理的Bean实例
	 * @param beanName 待处理Bean实例的id
	 * @return the bean instance to use, either the original or a wrapped one
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("目标 Bean 初始化之前处理：id=" + beanName + " , " + bean );
		return bean;
	}

	/**
	 * 这个方法会在目标Bean初始化之后被调用。
	 * 
	 * @param bean 待处理的Bean实例
	 * @param beanName 待处理Bean实例的id
	 * @return the bean instance to use, either the original or a wrapped one
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("目标 Bean 初始化之后处理：id=" + beanName + " , " + bean );
		return bean;
	}
}
