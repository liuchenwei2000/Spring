/**
 * 
 */
package aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 拥有五种不同类型增强处理的 Bean 示例
 * <p>
 * 几乎是纯净的 POJO，除了 Around 增强处理引入了 ProceedingJoinPoint。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月26日
 */
public class FiveAdviceAspect {

	public void enterMethod(){
		System.out.println("开始进入方法");
	}
	
	public void release(String s) {
		System.out.println("离开方法，释放资源......");
	}
	
	public void leaveMethod(Object returnObj) {// 方法参数名为 returnObj，与 XML 中配置的 returning 属性值对应
		System.out.println("离开方法，方法返回值是：" + returnObj);
	}
	
	public void catchException(Object ex) {// 方法参数名为 ex，与 XML 中配置的 throwing 属性值对应
		System.out.println("捕获未处理异常对象：" + ex);
	}
	
	public Object processTx(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(".....事务开始......");
		// 调用 ProceedingJoinPoint 的 proceed() 方法时，还可以传入一个 Object[] 对象，该数组中的值将被传入目标方法作为执行方法的实参。
		// 传入的 Object[] 数组长度与目标方法所需要参数的个数不相等，或者类型不匹配，程序就会出现异常。
		Object returnObj = joinPoint.proceed(new String[] { "改变的参数" });// 改变调用目标方法的参数
		System.out.println(".....事务结束......");
		return returnObj + "_新增的内容"; // 改变目标方法的返回值
	}
}
