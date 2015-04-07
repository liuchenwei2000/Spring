/**
 * 
 */
package bean.lifecycle.destroy;

import org.springframework.beans.factory.DisposableBean;

/**
 * POJO
 * <p>
 * �붨�Ƴ�ʼ����Ϊ���ƣ�SpringҲ�ṩ���ַ�������Beanʵ������֮ǰ���ض���Ϊ�������ַ�ʽ���£�
 * 1���������ļ���ʹ��destroy-method���ԡ�
 * 2��ʵ��DisposableBean�ӿڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class Order implements DisposableBean {

	private String name;
	private Item item;

	public Order() {
		super();
		System.out.println("����Orderʵ��");
	}
	
	public void close(){
		System.out.println("����֮ǰִ��close()����");
	}

	/**
	 * ʵ������ǰ����ñ�����
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("����֮ǰִ��destroy()����");
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