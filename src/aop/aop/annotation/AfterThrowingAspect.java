/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @AfterThrowing ������ʾ��
 * <p>
 * @AfterThrowing �����ڱ�עһ���׳��쳣����ǿ������Ҫ���ڴ��������δ������쳣��
 * <p>
 * AOP��AfterThrowing������Ȼ���Զ�Ŀ�귽�����쳣���д���������ֱ��ʹ��catch�����ǲ�ͬ�ģ�
 * catch�����쳣��ζ����ȫ������쳣�����catch����û�������׳����쳣����÷�����������������
 * ��AfterThrowing��Ȼ�����˸��쳣�������쳣��Ȼ�ᴫ������һ�������ߡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
// ʹ��@Aspectע�ⶨ��һ��������
@Aspect
public class AfterThrowingAspect {
	
	/**
	 * @AfterThrowing ͨ����Ҫָ���������ԣ�
	 * 1��pointcut��value
	 * ���������Ե�������һ���ģ�������ָ��������Ӧ�ı��ʽ���ȿ�����һ�����е�����㣬Ҳ��ֱ�Ӷ����������ʽ��
	 * 2��throwing
	 * ָ��һ������ֵ�β�������ǿ�����ͨ�����β�������Ŀ�귽�������׳����쳣����
	 * ��Ŀ�귽���׳�һ��δ������쳣ʱ�����쳣������Ϊ��Ӧ�Ĳ���������ǿ����
	 */
	@AfterThrowing(pointcut="execution(* *.*(..))", throwing="ex")
	public void catchException(Object ex) {// ����������Ϊ ex��������� throwing ����ֵ��Ӧ
		System.out.println("����δ�����쳣����" + ex);
	}
	
	/**
	 * throwing���Ի��ж�������ã��������޶������ֻƥ��ָ�����͵��쳣��
	 * ���籾���������ֻƥ���׳�NullPointerException�쳣�����з�����
	 */
	@AfterThrowing(pointcut="execution(* *.*(..))", throwing="npe")
	public void catchNullPointerException(NullPointerException npe) {
		System.out.println("����δ����Ŀ�ָ���쳣��" + npe.getMessage());
	}
}
