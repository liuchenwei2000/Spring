/**
 * 
 */
package context.event;

import org.springframework.context.ApplicationEvent;

/**
 * �������¼�
 * <p>
 * ApplicationEvent�������¼���������ApplicationContext������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��13��
 */
public class MyEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public MyEvent(Object source) {
		super(source);
	}
	
	public MyEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
