/**
 * 
 */
package aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ӵ�����ֲ�ͬ������ǿ�����Beanʾ��
 * <p>
 * �����Ǵ�����POJO������Around��ǿ����������ProceedingJoinPoint��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��26��
 */
public class FiveAdviceAspect {

	public void enterMethod(){
		System.out.println("��ʼ���뷽��");
	}
	
	public void release(String s) {
		System.out.println("�뿪�������ͷ���Դ......");
	}
	
	public void leaveMethod(Object returnObj) {// ����������Ϊ returnObj����XML�����õ� returning ����ֵ��Ӧ
		System.out.println("�뿪��������������ֵ�ǣ�" + returnObj);
	}
	
	public void catchException(Object ex) {// ����������Ϊ ex����XML�����õ� throwing ����ֵ��Ӧ
		System.out.println("����δ�����쳣����" + ex);
	}
	
	public Object processTx(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(".....����ʼ......");
		// ����ProceedingJoinPoint��proceed()����ʱ�������Դ���һ��Object[]���󣬸������е�ֵ��������Ŀ�귽����Ϊִ�з�����ʵ�Ρ�
		// �����Object[]���鳤����Ŀ�귽������Ҫ�����ĸ�������ȣ��������Ͳ�ƥ�䣬����ͻ�����쳣��
		Object returnObj = joinPoint.proceed(new String[] { "�ı�Ĳ���" });// �ı����Ŀ�귽���Ĳ���
		System.out.println(".....�������......");
		return returnObj + "_����������"; // �ı�Ŀ�귽���ķ���ֵ
	}
}
