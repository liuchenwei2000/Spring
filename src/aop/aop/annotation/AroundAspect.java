/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Around ������ʾ��
 * <p>
 * @Around ���ڱ�עAround��ǿ�������ȿ���ִ��Ŀ�귽��֮ǰ֯����ǿ������Ҳ����ִ��Ŀ�귽��֮��֯����ǿ������
 * <p>
 * Around��ǿ�����ǹ��ܱȽ�ǿ�����ǿ�������Ƶ���Before��ǿ�����AfterReturning��ǿ������ܺ͡�
 * �����ǲ�ͬ���ǣ�Around��ǿ������Ծ���Ŀ�귽����ʲôʱ��ִ�У����ִ�У�����������ȫ��ֹĿ�귽����ִ�С�
 * ͬʱ��Around��ǿ������Ըı�ִ��Ŀ�귽���Ĳ���ֵ��Ҳ���Ըı�ִ��Ŀ�귽��֮��ķ���ֵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
@Aspect
public class AroundAspect {
	
	/**
	 * @Around ͨ����Ҫָ��value���ԣ�ָ��������Ӧ�ı��ʽ���ȿ�����һ�����е�����㣬Ҳ��ֱ�Ӷ����������ʽ��
	 * 
	 * ������һ��Around��ǿ������ʱ���÷����ĵ�һ���βα�����ProceedingJoinPoint���ͣ����ٰ���һ���βΣ���
	 * ����ǿ���������ڣ�����ProceedingJoinPoint��proceed()�����Ż�ִ��Ŀ�귽����
	 * �����Around��ǿ���������ȫ����Ŀ�귽��ִ��ʱ�������ִ�еĹؼ������û�е���proceed()��������Ŀ�귽�����ᱻִ�С�
	 */
	@Around(value="execution(* *.insert*(..))")
	public Object processTx(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(".....����ʼ......");
		// ����ProceedingJoinPoint��proceed()����ʱ�������Դ���һ��Object[]���󣬸������е�ֵ��������Ŀ�귽����Ϊִ�з�����ʵ�Ρ�
		// �����Object[]���鳤����Ŀ�귽������Ҫ�����ĸ�������ȣ��������Ͳ�ƥ�䣬����ͻ�����쳣��
		Object returnObj = joinPoint.proceed(new String[] { "�ı�Ĳ���" });// �ı����Ŀ�귽���Ĳ���
		System.out.println(".....�������......");
		return returnObj + "_����������"; // �ı�Ŀ�귽���ķ���ֵ
	}
}
