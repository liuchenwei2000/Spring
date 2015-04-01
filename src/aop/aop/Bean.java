/**
 * 
 */
package aop;

import java.util.Date;

/**
 * POJO 
 * <p>
 * ����ܴ�����˿����֪��������˭��������ǿ��Ҳ��֪������������������ǿ��
 * �����AOP����������Ŀ������Ա����޵���ǿ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
public class Bean {

	public void sayHello(){
		System.out.println("Nice to meet you.");
	}
	
	public String goodbye(){
		return "See you tomorrow.";
	}
	
	public void calculate() {
		System.out.println(1 / 0);
	}

	public void calculateWithoutException() {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			// do nothing
		} finally {
			System.out.println(Double.POSITIVE_INFINITY);
		}
	}
	
	public void call1() {
		System.out.println("call 911");
	}

	public void call2() {
		System.out.println("I will call 911");
		throw new RuntimeException("Phone is unavailable");
	}
	
	public void call3(String name) {
		System.out.println("I will call " + name);
	}
	
	public String insertString(String newString) {
		System.out.println(newString + "��������");
		return newString;
	}
	
	public void eat(String food, Date date) {
		System.out.println(date + " I eat " + food);
	}

	public void register(String name, int age, char sex) {
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("sex=" + sex);
	}
}
