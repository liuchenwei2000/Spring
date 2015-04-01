/**
 * 
 */
package postprocessor.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��20��
 */
public class MyBean implements InitializingBean {

	private String name;

	public MyBean() {
		super();
		System.out.println("����MyBeanʵ��");
	}
	
	public void init(){
		System.out.println("��init()�������ʼ��");
	}

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
}