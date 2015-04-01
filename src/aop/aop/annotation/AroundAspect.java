/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Around 切面类示例
 * <p>
 * @Around 用于标注Around增强处理，它既可在执行目标方法之前织入增强动作，也可在执行目标方法之后织入增强动作。
 * <p>
 * Around增强处理是功能比较强大的增强处理，近似等于Before增强处理和AfterReturning增强处理的总和。
 * 与它们不同的是，Around增强处理可以决定目标方法在什么时候执行，如何执行，甚至可以完全阻止目标方法的执行。
 * 同时，Around增强处理可以改变执行目标方法的参数值，也可以改变执行目标方法之后的返回值。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
@Aspect
public class AroundAspect {
	
	/**
	 * @Around 通常需要指定value属性，指定切入点对应的表达式，既可以是一个已有的切入点，也可直接定义切入点表达式。
	 * 
	 * 当定义一个Around增强处理方法时，该方法的第一个形参必须是ProceedingJoinPoint类型（至少包含一个形参），
	 * 在增强处理方法体内，调用ProceedingJoinPoint的proceed()方法才会执行目标方法。
	 * 这就是Around增强处理可以完全控制目标方法执行时机、如何执行的关键；如果没有调用proceed()方法，则目标方法不会被执行。
	 */
	@Around(value="execution(* *.insert*(..))")
	public Object processTx(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(".....事务开始......");
		// 调用ProceedingJoinPoint的proceed()方法时，还可以传入一个Object[]对象，该数组中的值将被传入目标方法作为执行方法的实参。
		// 传入的Object[]数组长度与目标方法所需要参数的个数不相等，或者类型不匹配，程序就会出现异常。
		Object returnObj = joinPoint.proceed(new String[] { "改变的参数" });// 改变调用目标方法的参数
		System.out.println(".....事务结束......");
		return returnObj + "_新增的内容"; // 改变目标方法的返回值
	}
}
