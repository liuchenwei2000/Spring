/**
 * 
 */
package aop.annotation;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * args���ʽ ʾ��
 * <p>
 * ���ֻ��Ҫ����Ŀ�귽���Ĳ���������ʹ��args����Ŀ�귽���Ĳ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
// ʹ��@Aspectע�ⶨ��һ��������
@Aspect
public class AccessArgsAspect {
	
	/**
	 * ���һ��args���ʽ��ָ����һ�������������������㽫ֻƥ����ж�Ӧ�βεķ�������Ŀ�귽���Ĳ���ֵ����������ǿ��������
	 * 
	 * &&args(food,time) ��ζ������ǿ�������ж���food��time�����βΣ��β����Ϳ�������ָ����һ��ָ�����β����ͣ�
	 * ���������Ƹ������ֻƥ���һ������������String���ڶ�������������Date�ķ�����
	 */
	@Before(value="execution(* *.*(..)) && args(food, time)")
	public void enterMethod(String food, Date time){
		System.out.println("Ŀ�귽���е�String�����ǣ�" + food);
		System.out.println("Ŀ�귽���е�Date�����ǣ�" + time);
	}
	
	/**
	 * args ���ʽ�����е� .. ��ʾ��ƥ����� ����
	 */
	// ƥ����е�һ��������String���ڶ���������int���͵ķ��������������Ƿ��и����������
	@Before(value="execution(* *.*(..)) && args(name, age, ..)")
	public void enterMethod(String name, int age){
		System.out.println("Ŀ�귽���е�name�����ǣ�" + name);
		System.out.println("Ŀ�귽���е�age�����ǣ�" + age);
	}
}
