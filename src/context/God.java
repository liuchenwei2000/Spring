/**
 * 
 */
package context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ӵ�з���Spring����������Beanʾ��
 * <p>
 * �����е�Bean������Ҫ��������Spring��������ʵ��BeanFactoryAware�ӿڵ�Bean��ӵ�з���BeanFactory������������
 * ͬ��ʵ��ApplicationContextAware�ӿڵ�Bean�ܹ�����ApplicationContext��
 * <p>
 * ʵ�ֽӿ���Beanӵ���˷�������������������Ⱦ�˴��룬���´�����Spring�ӿ������һ��
 * ��ˣ���������ر��Ҫ�����鲻Ҫֱ�ӷ���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��13��
 */
public class God implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	/**
	 * �����������Spring���ã�Spring���ø÷���ʱ�ὫSpring������Ϊ��������÷�����
	 * <p>
	 * ��������applicationContextָ�򴴽�����ApplicationContextʵ����
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
