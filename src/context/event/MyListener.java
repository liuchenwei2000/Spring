/**
 * 
 */
package context.event;

import org.springframework.context.ApplicationListener;

/**
 * �����ļ�����
 * <p>
 * ApplicationListener�������������������е��κμ�����Bean���Ρ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��13��
 */
public class MyListener implements ApplicationListener<MyEvent> {

	/**
	 * ÿ�������ڷ����κ��¼����˷���������������
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("I catched the event:"+ event.getMessage());
	}
}
