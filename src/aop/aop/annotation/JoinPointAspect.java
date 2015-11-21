/**
 * 
 */
package aop.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 在切面类中访问目标方法信息示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
@Aspect
public class JoinPointAspect {
	
	/**
	 * 访问目标方法最简单的做法是定义增强处理方法时，将第一个参数定义为JoinPoint类型（ProceedJoinPoint是其子类），
	 * 当增强处理方法被调用时，该JoinPoint参数就代表了织入增强处理的连接点。
	 */
	@Before(value="execution(* *.*(..))")
	public void enterMethod(JoinPoint jp) {
		// 返回被增强方法的签名信息。
		Signature signature = jp.getSignature();
		System.out.println("开始进入方法：" + signature.getName());
		// 返回执行目标方法时的参数。
		Object[] args = jp.getArgs();
		if (args != null && args.length > 0) {
			System.out.println("方法参数：" + Arrays.asList(args));
		}

		// 返回被织入增强处理的目标对象。
		System.out.println("目标对象：" + jp.getTarget());

		// 返回AOP框架为目标对象生成的代理对象。
		Object proxy = jp.getThis();
		if (proxy != null) {
			System.out.println("AOP代理对象：" + proxy.getClass());
		}
	}
}
