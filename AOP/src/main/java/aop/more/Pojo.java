/**
 * 
 */
package aop.more;

/**
 * POJO
 * <p>
 * Spring AOP 在同一个类里自身方法相互调用时无法拦截。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年4月10日
 */
public class Pojo {

	/**
	 * 该方法内部会调用另一个方法，这称为自调用（self-invocation）。
	 */
	public void foo(){
		System.out.println("in foo()");
		// 自调用的方法不会被切面织入，比如下面对 bar() 方法的调用就不会被 before 增强。
		this.bar();
	}
	
	public void bar(){
		System.out.println("in bar()");
	}
}
