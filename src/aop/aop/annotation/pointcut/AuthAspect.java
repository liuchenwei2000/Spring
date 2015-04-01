/**
 * 
 */
package aop.annotation.pointcut;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 定义切入点示例
 * <p>
 * 定义切入点，其实质就是为一个切入点表达式起一个名称，从而允许在多个增强处理中重用该名称。
 * Spring AOP只支持以Spring Bean的方法执行处作为连接点，所以可把切入点看成所有能和切入表达式匹配的Bean方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月26日
 */
@Aspect
public class AuthAspect {

	/**
	 * 切入点签名采用一个普通的方法定义（方法体通常为空）来提供，且方法返回值必须是void；切入点表达式使用 @Pointcut 注解来标注。
	 * <p>
	 * 切入点定义包含两部分：
	 * 1，切入点表达式：用于指定该切入点和哪些方法进行匹配。
	 * 2，包含名字和任意参数的方法签名：将作为该切入点的名称。
	 * <p>
	 * 本例匹配所有名为addXxx的方法（方法参数随意），切入点名叫 anyAddMethod。
	 */
	@Pointcut(value="execution(* add*(..))")
	private void anyAddMethod(){
		// do nothing
	}
	
	/**
	 * 定义了切入点之后，程序就可以多次重复使用该切入点了，甚至可以在其他切面类、其他包的切面类里使用，
	 * 这取决于切入点定义方法的访问控制符。本例的 anyAddMethod 切入点是 private，所以只能在本切面类内使用。
	 */
	@Before(value="anyAddMethod()")
	public void enterMethod(){
		System.out.println("认证通过....");
	}
	
	/**
	 * 当使用其他切面类中的切入点时，应该使用切面类作为前缀来限制切入点。
	 */
	@AfterReturning(value="SystemPointcut.anyMethod()", returning="returnObj")
	public void leaveMethod(Object returnObj){
		System.out.println("离开方法....");
	}
}
