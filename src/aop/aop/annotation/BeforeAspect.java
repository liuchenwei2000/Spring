/**
 * 
 */
package aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Before ������ʾ��
 * <p>
 * ʹ�� @Before ��ע��һ������ʱ���÷�������ΪBefore��ǿ����������Ŀ�귽��ִ��ǰ��֯�롣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
// ʹ��@Aspectע�ⶨ��һ��������
@Aspect
public class BeforeAspect {
	
	/**
	 * @Before ͨ����Ҫָ��һ��value����ֵ����ֵָ�����������ʽ���ȿ��������е�����㣬
	 * Ҳ����ֱ�Ӷ����������ʽ��������ָ������ǿ������֯����Щ����㡣
	 */
	@Before(value="execution(* *.*(..))")// ƥ�����з�����ִ����Ϊ����㡣
	public void enterMethod(){
		System.out.println("��ʼ���뷽��");
	}
}
