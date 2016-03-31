/**
 * 
 */
package bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

import bean.instance.factory2.Chinese;
import bean.instance.factory2.IPerson;

/**
 * FactoryBean 示例
 * <p>
 * FactoryBean 接口是工厂 Bean 的标准接口，实现该接口的 Bean 无法作为正常 Bean 使用，只能作为工厂 Bean 使用。
 * 将工厂 Bean 部署在容器中，并通过 getBean() 方法来获取实例时，容器返回的是该 FactoryBean 的产品而不是 FactoryBean 本身。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月18日
 */
public class PersonFactoryBean implements FactoryBean<IPerson>{

	private static IPerson singleton = new Chinese("A chinese");
	
	/**
	 * 返回该工厂 Bean 生成的 Java 实例。
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public IPerson getObject() throws Exception {
		return singleton;
	}

	/**
	 * 返回生成 Java 实例的实现类。
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		return Chinese.class;
	}

	/**
	 * 返回生成的 Java 实例是否为单例模式。
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
