/**
 * 
 */
package bean.adv.methodinvoking;

/**
 * 具有返回值方法的类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月20日
 */
public class ValueGenerator {

	/**
	 * 返回值的静态方法
	 */
	public static String genStaticString(){
		return "static";
	}
	
	/**
	 * 返回值的非静态方法
	 */
	public String genString(){
		return "non-static";
	}
	
	/**
	 * 返回值且有参数的非静态方法
	 */
	public String genString(String param) {
		return "non-static:" + param;
	}
}
