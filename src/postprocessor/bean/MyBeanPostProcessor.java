/**
 * 
 */
package postprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Bean������ʾ��
 * <p>
 * Bean��������һ�������Bean�������������ṩ������������id���ԡ�
 * ����Ҫ����������е�����Beanִ�к�������Ϊ�����е�Ŀ��Bean���ɴ���ȡ�
 * <p>
 * Bean����������Beanʵ�������ɹ�֮�󣬶�Beanʵ�����н�һ������ǿ������ͨ����������ǽӿڣ����߽�Bean��װ��һ��Proxy��
 * Spring�ĺܶ๤���࣬����ͨ��Bean��������ɵģ�����BeanNameAutoProxyCreator��DefaultAdvisorAutoProxyCreator��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��20��
 */
public class MyBeanPostProcessor implements BeanPostProcessor {// ��Ҫʵ�� BeanPostProcessor �ӿ�

	/**
	 * �����������Ŀ��Bean��ʼ��֮ǰ�����á�
	 * 
	 * @param bean �������Beanʵ��
	 * @param beanName ������Beanʵ����id
	 * @return the bean instance to use, either the original or a wrapped one
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Ŀ�� Bean ��ʼ��֮ǰ����id=" + beanName + " , " + bean );
		return bean;
	}

	/**
	 * �����������Ŀ��Bean��ʼ��֮�󱻵��á�
	 * 
	 * @param bean �������Beanʵ��
	 * @param beanName ������Beanʵ����id
	 * @return the bean instance to use, either the original or a wrapped one
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Ŀ�� Bean ��ʼ��֮����id=" + beanName + " , " + bean );
		return bean;
	}
}
