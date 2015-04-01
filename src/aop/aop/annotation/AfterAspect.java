/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * @After ������ʾ��
 * <p>
 * @After ��ǿ������ @AfterReturning ��ǿ�����е����ƣ���Ҳ������
 * @AferReturning ��ǿ����ֻ����Ŀ�귽���ɹ���ɺ�Żᱻ֯�롣
 * @After ��ǿ������Ŀ�귽����ν����������ɹ���ɺ������쳣��ֹ���������ᱻ֯�롣
 * ��� @After ��ǿ�������׼�������������غ��쳣����������������÷ǳ�������finally������ã�ͨ�������ͷ���Դ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
@Aspect
public class AfterAspect {
	
	/**
	 * @After ͨ����Ҫָ��value���ԣ�ָ��������Ӧ�ı��ʽ���ȿ�����һ�����е�����㣬Ҳ��ֱ�Ӷ����������ʽ��
	 */
	@After(value="execution(* *.call*(..))")
	public void release() {
		System.out.println("�뿪�������ͷ���Դ......");
	}
}
