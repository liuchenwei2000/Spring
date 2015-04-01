/**
 * 
 */
package aop.annotation.pointcut;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ���������ʾ��
 * <p>
 * ��������㣬��ʵ�ʾ���Ϊһ���������ʽ��һ�����ƣ��Ӷ������ڶ����ǿ���������ø����ơ�
 * Spring AOPֻ֧����Spring Bean�ķ���ִ�д���Ϊ���ӵ㣬���Կɰ�����㿴�������ܺ�������ʽƥ���Bean������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��26��
 */
@Aspect
public class AuthAspect {

	/**
	 * �����ǩ������һ����ͨ�ķ������壨������ͨ��Ϊ�գ����ṩ���ҷ�������ֵ������void���������ʽʹ�� @Pointcut ע������ע��
	 * <p>
	 * ����㶨����������֣�
	 * 1���������ʽ������ָ������������Щ��������ƥ�䡣
	 * 2���������ֺ���������ķ���ǩ��������Ϊ�����������ơ�
	 * <p>
	 * ����ƥ��������ΪaddXxx�ķ����������������⣩����������� anyAddMethod��
	 */
	@Pointcut(value="execution(* add*(..))")
	private void anyAddMethod(){
		// do nothing
	}
	
	/**
	 * �����������֮�󣬳���Ϳ��Զ���ظ�ʹ�ø�������ˣ��������������������ࡢ����������������ʹ�ã�
	 * ��ȡ��������㶨�巽���ķ��ʿ��Ʒ��������� anyAddMethod ������� private������ֻ���ڱ���������ʹ�á�
	 */
	@Before(value="anyAddMethod()")
	public void enterMethod(){
		System.out.println("��֤ͨ��....");
	}
	
	/**
	 * ��ʹ�������������е������ʱ��Ӧ��ʹ����������Ϊǰ׺����������㡣
	 */
	@AfterReturning(value="SystemPointcut.anyMethod()", returning="returnObj")
	public void leaveMethod(Object returnObj){
		System.out.println("�뿪����....");
	}
}
