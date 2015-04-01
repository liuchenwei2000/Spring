/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @AfterReturning 切面类示例
 * <p>
 * @AfterReturning 来标注一个方法后增强处理，它将在目标方法正常完成后被织入。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
@Aspect
public class AfterReturningAspect {
	
	/**
	 * @AfterReturning 通常需要指定两个属性：
	 * 1，pointcut或value
	 * 这两个属性的作用是一样的，都用于指定切入点对应的表达式，既可以是一个已有的切入点，也可直接定义切入点表达式。
	 * 2，returning
	 * 指定一个返回值形参名，使得增强处理可以通过该参数访问目标方法的返回值。
	 * 形参名必须对应于增强处理中的一个形参名，当目标方法执行返回后，返回值作为参数被传入增强处理方法。
	 */
	@AfterReturning(pointcut="execution(* *.*(..))", returning="returnObj")
	public void leaveMethod(Object returnObj) {// 方法参数名为 returnObj，与上面的 returning 属性值对应
		System.out.println("离开方法，方法返回值是：" + returnObj);
	}
	
	/**
	 * returning属性还有额外的作用：它可用于限定切入点只匹配具有对应返回值类型的方法。
	 * 比如本例该切入点只匹配返回值类型为String的所有方法。
	 */
	@AfterReturning(pointcut="execution(* *.*(..))", returning="returnStr")
	public void leaveStringMethod(String returnStr) {
		System.out.println("离开方法，方法返回字符串是：" + returnStr);
	}
}
