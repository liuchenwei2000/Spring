/**
 * 
 */
package bean.lifecycle.init;

import org.springframework.beans.factory.InitializingBean;

/**
 * POJO
 * <p>
 * Spring�ṩ���ַ�ʽ��Bean��ȫ������ע����ɺ�ִ���ض���Ϊ��
 * 1���������ļ���ʹ��init-method���ԡ�
 * 2��ʵ��InitializaingBean�ӿڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class Order implements InitializingBean {

	private String name;
	private Item item;

	public Order() {
		super();
		System.out.println("����Orderʵ��");
	}
	
	public void init(){
		System.out.println("��init()�������ʼ��");
	}

	/**
	 * Spring������Ϊ��Beanע��������ϵ֮�󣬽���������ø�Bean��ʵ�ֵ�afterPropertiesSet������
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("��afterPropertiesSet()�������ʼ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
		System.out.println("ΪOrderʵ��ע��һ��Itemʵ��");
	}
}