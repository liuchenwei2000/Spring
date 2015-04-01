/**
 * 
 */
package aop.annotation.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ����ֻ������һ����������㡣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��26��
 */
@Aspect
public class SystemPointcut {

	/**
	 * ������public�ģ����Ա��������Ա��κ�������ʹ�á�
	 */
	@Pointcut(value="execution(* *.*(..))")// ƥ�����з�����ִ����Ϊ����㡣
	public void anyMethod(){
		// do nothing
	}
}
