/**
 * 
 */
package aop.more;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {
	
	@Before(value="execution(* *.*(..))")// 匹配所有方法的执行作为切入点。
	public void enterMethod(){
		System.out.println("开始进入方法");
	}
}
