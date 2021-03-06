/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * args 表达式示例
 * <p>
 * 如果只是要访问目标方法的参数，可以使用 args 来绑定目标方法的参数。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
@Aspect
public class AccessArgsAspect {
	
	/**
	 * 如果一个 args 表达式中指定了一个或多个参数，则该切入点将只匹配具有对应形参的方法，
	 * 且目标方法的参数值将被传入增强处理方法。
	 * 
	 * && args(food,time) 意味着在增强处理方法中定义 food、time 两个形参，
	 * 形参类型可以随意指定，一旦指定了形参类型，
	 * 则将用于限制该切入点只匹配第一个参数类型是 String，第二个参数类型是 Date 的方法。
	 */
	@Before(value="execution(* *.*(..)) && args(food, time)")
	public void enterMethod(String food, Date time){
		System.out.println("目标方法中的String参数是：" + food);
		System.out.println("目标方法中的Date参数是：" + time);
	}
	
	/**
	 * args 表达式括号中的 .. 表示可匹配更多 参数
	 */
	// 匹配具有第一个参数是 String，第二个参数是 int 类型的方法（而不关心是否还有更多参数）。
	@Before(value="execution(* *.*(..)) && args(name, age, ..)")
	public void enterMethod(String name, int age){
		System.out.println("目标方法中的name参数是：" + name);
		System.out.println("目标方法中的age参数是：" + age);
	}
}
