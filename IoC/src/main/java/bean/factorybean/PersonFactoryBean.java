/**
 * 
 */
package bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

import bean.instance.factory2.Chinese;
import bean.instance.factory2.IPerson;

/**
 * FactoryBean示例
 * <p>
 * FactoryBean接口是工厂Bean的标准接口，实现该接口的Bean无法作为正常Bean使用，只能作为工厂Bean使用。
 * 将工厂Bean部署在容器中，并通过getBean()方法来获取实例时，容器返回的是该FactoryBean的产品而不是FactoryBean本身。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月18日
 */
public class PersonFactoryBean implements FactoryBean<IPerson>{

	private static IPerson singleton = new Chinese("A chinese");
	
	/**
	 * 返回该工厂Bean生成的Java实例。
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public IPerson getObject() throws Exception {
		return singleton;
	}

	/**
	 * 返回生成Java实例的实现类。
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		return Chinese.class;
	}

	/**
	 * 返回生成的Java实例是否为单例模式。
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
