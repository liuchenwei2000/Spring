/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * @After 切面类示例
 * <p>
 * @After 增强处理与 @AfterReturning 增强处理有点相似，但也有区别：
 * @AferReturning 增强处理只有在目标方法成功完成后才会被织入。
 * @After 增强处理不管目标方法如何结束（包括成功完成和遇到异常中止），它都会被织入。
 * 因此 @After 增强处理必须准备处理正常返回和异常返回两种情况，作用非常类似于finally块的作用，通常用于释放资源。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
@Aspect
public class AfterAspect {
	
	/**
	 * @After 通常需要指定value属性，指定切入点对应的表达式，既可以是一个已有的切入点，也可直接定义切入点表达式。
	 */
	@After(value="execution(* *.call*(..))")
	public void release() {
		System.out.println("离开方法，释放资源......");
	}
}
