/**
 * 
 */
package context.event;

import org.springframework.context.ApplicationListener;

/**
 * 上下文监听器
 * <p>
 * ApplicationListener：监听器，可由容器中的任何监听器Bean担任。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
 */
public class MyListener implements ApplicationListener<MyEvent> {

	/**
	 * 每当容器内发生任何事件，此方法都将被触发。
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("I catched the event:"+ event.getMessage());
	}
}
