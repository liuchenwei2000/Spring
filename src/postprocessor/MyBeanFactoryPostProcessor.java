/**
 * 
 */
package postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * ����������ʾ��
 * <p>
 * Bean�����������������е�����Beanʵ������������������������������
 * ����������ͨ�����ڶ�Spring�������д�����������������ʵ�����κ�������Bean֮ǰ��ȡ�����ļ���Ԫ���ݣ����п����޸���ЩԪ���ݡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��21��
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/**
	 * ʵ�ָ÷�����Spring�������д���
	 * 
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Spring ������ " + beanFactory);
	}
}
