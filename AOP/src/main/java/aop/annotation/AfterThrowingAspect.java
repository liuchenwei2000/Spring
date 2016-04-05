/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * AfterThrowing增强处理切面类示例
 * <p>
 * @AfterThrowing 可用于标注一个抛出异常后增强处理，主要用于处理程序中未捕获的异常。
 * <p>
 * AOP 的 AfterThrowing 处理虽然可以对目标方法的异常进行处理，但这与直接使用 catch 捕获是不同的：
 * catch 捕获异常意味着完全处理该异常，如果 catch 块中没有重新抛出新异常，则该方法可以正常结束；
 * 而 AfterThrowing 虽然处理了该异常，但该异常依然会传播到上一级调用者。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
@Aspect
public class AfterThrowingAspect {
	
	/**
	 * @AfterThrowing 通常需要指定两个属性：
	 * 1，pointcut或value
	 * 这两个属性的作用是一样的，都用于指定切入点对应的表达式，既可以是一个已有的切入点，也可直接定义切入点表达式。
	 * 2，throwing
	 * 指定一个返回值形参名，增强处理可通过该形参名访问目标方法中所抛出的异常对象。
	 * 当目标方法抛出一个未处理的异常时，该异常将会作为对应的参数传给增强处理。
	 */
	@AfterThrowing(pointcut="execution(* *.*(..))", throwing="ex")
	public void catchException(Object ex) {// 方法参数名为 ex，与上面的 throwing 属性值对应
		System.out.println("捕获未处理异常对象：" + ex);
	}
	
	/**
	 * throwing 属性还有额外的作用：可用于限定切入点只匹配指定类型的异常。
	 * 比如本例该切入点只匹配抛出 NullPointerException 异常的所有方法。
	 */
	@AfterThrowing(pointcut="execution(* *.*(..))", throwing="npe")
	public void catchNullPointerException(NullPointerException npe) {
		System.out.println("捕获未处理的空指针异常：" + npe.getMessage());
	}
}
