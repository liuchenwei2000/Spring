/**
 * 
 */
package bean.lifecycle.init;

import org.springframework.beans.factory.InitializingBean;

/**
 * POJO
 * <p>
 * Spring提供两种方式在Bean的全部属性注入完成后执行特定行为：
 * 1，在配置文件中使用init-method属性。
 * 2，实现InitializaingBean接口。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
 */
public class Order implements InitializingBean {

	private String name;
	private Item item;

	public Order() {
		super();
		System.out.println("创建Order实例");
	}
	
	public void init(){
		System.out.println("在init()方法里初始化");
	}

	/**
	 * Spring容器在为该Bean注入依赖关系之后，接下来会调用该Bean所实现的afterPropertiesSet方法。
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("在afterPropertiesSet()方法里初始化");
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