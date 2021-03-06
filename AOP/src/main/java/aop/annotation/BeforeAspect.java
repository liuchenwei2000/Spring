/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Before增强处理切面类示例
 * <p>
 * 使用 @Before 来注解一个方法时，该方法将作为 Before 增强处理，它将在目标方法执行前被织入。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
// 使用@Aspect注解定义一个切面类
// <aop:aspect> 元素和 @AspectJ 注解都是把一个 POJO 转变为一个切面的有效形式。
// 但是，<aop:aspect> 的优势是不需要实现切面功能的代码，通过 @AspectJ 则必须标注类和方法，
// 它需要有源码，而 <aop:aspect> 可以引用任意一个 Bean。
@Aspect
public class BeforeAspect {
	
	/**
	 * @Before 通常需要指定一个value属性值，该值指定了切入点表达式（既可以是已有的切入点，
	 * 也可以直接定义切入点表达式），用于指定该增强处理将被织入哪些切入点。
	 */
	@Before(value="execution(* *.*(..))")// 匹配所有方法的执行作为切入点。
	public void enterMethod(){
		System.out.println("开始进入方法");
	}
}
