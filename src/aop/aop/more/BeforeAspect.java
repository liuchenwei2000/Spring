/**
 * 
 */
package aop.more;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {
	
	@Before(value="execution(* *.*(..))")// ƥ�����з�����ִ����Ϊ����㡣
	public void enterMethod(){
		System.out.println("��ʼ���뷽��");
	}
}
