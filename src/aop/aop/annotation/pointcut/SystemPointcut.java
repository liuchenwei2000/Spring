/**
 * 
 */
package aop.annotation.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 本类只定义了一个公共切入点。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月26日
 */
@Aspect
public class SystemPointcut {

	/**
	 * 方法是public的，所以本切入点可以被任何切面类使用。
	 */
	@Pointcut(value="execution(* *.*(..))")// 匹配所有方法的执行作为切入点。
	public void anyMethod(){
		// do nothing
	}
}
