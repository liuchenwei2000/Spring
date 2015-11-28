/**
 * 
 */
package bean.instance.factory2;

/**
 * 创建IPerson实例的实例工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月17日
 */
public class PersonFactory {

	/**
	 * 创建实例：根据参数创建对应的IPerson实例
	 */
	public IPerson create(String type) {
		if ("usa".equals(type.toLowerCase())) {
			return new American();
		} else if ("cn".equals(type.toLowerCase())) {
			return new Chinese();
		}
		return null;
	}
}
