/**
 * 
 */
package aop.more;

/**
 * POJO
 * <p>
 * Spring AOP��ͬһ�������������໥����ʱ�޷����ء�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��4��10��
 */
public class Pojo {

	/**
	 * �÷����ڲ��������һ�����������Ϊ�Ե��ã�self-invocation����
	 */
	public void foo(){
		System.out.println("in foo()");
		// �Ե��õķ������ᱻ����֯�룬��������� bar() �����ĵ��þͲ��ᱻ before ��ǿ��
		this.bar();
	}
	
	public void bar(){
		System.out.println("in bar()");
	}
}
