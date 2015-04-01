/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @AfterReturning ������ʾ��
 * <p>
 * @AfterReturning ����עһ����������ǿ����������Ŀ�귽��������ɺ�֯�롣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
@Aspect
public class AfterReturningAspect {
	
	/**
	 * @AfterReturning ͨ����Ҫָ���������ԣ�
	 * 1��pointcut��value
	 * ���������Ե�������һ���ģ�������ָ��������Ӧ�ı��ʽ���ȿ�����һ�����е�����㣬Ҳ��ֱ�Ӷ����������ʽ��
	 * 2��returning
	 * ָ��һ������ֵ�β�����ʹ����ǿ�������ͨ���ò�������Ŀ�귽���ķ���ֵ��
	 * �β��������Ӧ����ǿ�����е�һ���β�������Ŀ�귽��ִ�з��غ󣬷���ֵ��Ϊ������������ǿ��������
	 */
	@AfterReturning(pointcut="execution(* *.*(..))", returning="returnObj")
	public void leaveMethod(Object returnObj) {// ����������Ϊ returnObj��������� returning ����ֵ��Ӧ
		System.out.println("�뿪��������������ֵ�ǣ�" + returnObj);
	}
	
	/**
	 * returning���Ի��ж�������ã����������޶������ֻƥ����ж�Ӧ����ֵ���͵ķ�����
	 * ���籾���������ֻƥ�䷵��ֵ����ΪString�����з�����
	 */
	@AfterReturning(pointcut="execution(* *.*(..))", returning="returnStr")
	public void leaveStringMethod(String returnStr) {
		System.out.println("�뿪���������������ַ����ǣ�" + returnStr);
	}
}
