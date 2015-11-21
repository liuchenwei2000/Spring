/**
 * 
 */
package context.event;

import org.springframework.context.ApplicationEvent;

/**
 * 上下文事件
 * <p>
 * ApplicationEvent：容器事件，必须由ApplicationContext发布。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
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
