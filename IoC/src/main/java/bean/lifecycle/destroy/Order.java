/**
 * 
 */
package bean.lifecycle.destroy;

import org.springframework.beans.factory.DisposableBean;

/**
 * POJO
 * <p>
 * 与定制初始化行为相似，Spring也 提供两种方法定制 Bean 实例销毁之前的特定行为，这两种方式如下：
 * 1，在配置文件中使用 destroy-method 属性。
 * 2，实现 DisposableBean 接口。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
 */
public class Order implements DisposableBean {

	private String name;
	private Item item;

	public Order() {
		super();
		System.out.println("创建Order实例");
	}
	
	public void close(){
		System.out.println("销毁之前执行close()方法");
	}

	/**
	 * 实例销毁前会调用本方法
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("销毁之前执行destroy()方法");
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
		System.out.println("为Order实例注入一个Item实例");
	}
}
