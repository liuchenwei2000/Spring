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
 * ���������з���Ŀ�귽����Ϣʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
@Aspect
public class JoinPointAspect {
	
	/**
	 * ����Ŀ�귽����򵥵������Ƕ�����ǿ������ʱ������һ����������ΪJoinPoint���ͣ�ProceedJoinPoint�������ࣩ��
	 * ����ǿ������������ʱ����JoinPoint�����ʹ�����֯����ǿ��������ӵ㡣
	 */
	@Before(value="execution(* *.*(..))")
	public void enterMethod(JoinPoint jp) {
		// ���ر���ǿ������ǩ����Ϣ��
		Signature signature = jp.getSignature();
		System.out.println("��ʼ���뷽����" + signature.getName());
		// ����ִ��Ŀ�귽��ʱ�Ĳ�����
		Object[] args = jp.getArgs();
		if (args != null && args.length > 0) {
			System.out.println("����������" + Arrays.asList(args));
		}

		// ���ر�֯����ǿ�����Ŀ�����
		System.out.println("Ŀ�����" + jp.getTarget());

		// ����AOP���ΪĿ��������ɵĴ������
		Object proxy = jp.getThis();
		if (proxy != null) {
			System.out.println("AOP�������" + proxy.getClass());
		}
	}
}
