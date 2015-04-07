/**
 * 
 */
package bean.other;

import org.springframework.beans.factory.BeanNameAware;

/**
 * ֪���Լ�ID��Beanʾ��
 * <p>
 * һ������£���������ͨ��Bean id��������ȡBeanʵ����
 * ����ĳЩ����£�Bean��������Ҫ��ȡ���ø�Beanʱָ����id���ԡ�
 * ��ʱ����ͨ��ʵ��BeanNameAware�ӿڣ�����Bean���ȡ������ʱ��id���ԡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class BeanWhoKnowsID implements BeanNameAware {

	private String id;

	/**
	 * �÷��������ɳ���Ա�����ã�������Spring����������ã�������Ѳ����Bean��id������Ϊ�������롣
	 * <p>
	 * Spring��������Bean��ʼ����ɺ�ص��÷���������������ĳ�ʼ��ָ����Bean�ĳ�ʼ����Ϊ��
	 * �����ص�InitializingBean�ӿ���ʵ�ֵ�afterPropertiesSet�������ص�Bean������init-method������ָ���ķ�����
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
