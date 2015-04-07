/**
 * 
 */
package bean.instance.factory;

/**
 * 创建IBeing实例的静态工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月17日
 */
public class BeingFactory {

	/**
	 * 静态方法：根据参数创建对应的IBeing实例
	 */
	public static IBeing create(String type) {
		if ("dog".equals(type.toLowerCase())) {
			return new Dog();
		} else if ("cat".equals(type.toLowerCase())) {
			return new Cat();
		}
		return null;
	}
}
