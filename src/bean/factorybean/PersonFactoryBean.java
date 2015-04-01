/**
 * 
 */
package bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

import bean.instance.factory2.Chinese;
import bean.instance.factory2.IPerson;

/**
 * FactoryBeanʾ��
 * <p>
 * FactoryBean�ӿ��ǹ���Bean�ı�׼�ӿڣ�ʵ�ָýӿڵ�Bean�޷���Ϊ����Beanʹ�ã�ֻ����Ϊ����Beanʹ�á�
 * ������Bean�����������У���ͨ��getBean()��������ȡʵ��ʱ���������ص��Ǹ�FactoryBean�Ĳ�Ʒ������FactoryBean����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��18��
 */
public class PersonFactoryBean implements FactoryBean<IPerson>{

	private static IPerson singleton = new Chinese("A chinese");
	
	/**
	 * ���ظù���Bean���ɵ�Javaʵ����
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public IPerson getObject() throws Exception {
		return singleton;
	}

	/**
	 * ��������Javaʵ����ʵ���ࡣ
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		return Chinese.class;
	}

	/**
	 * �������ɵ�Javaʵ���Ƿ�Ϊ����ģʽ��
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
