/**
 * 
 */
package aop;

import java.util.Date;

/**
 * POJO 
 * <p>
 * 本类很纯净，丝毫不知道它将被谁来进行增强，也不知道将被进行怎样的增强。
 * 这才是 AOP 最大的魅力，目标类可以被无限的增强。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
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
		System.out.println(newString + "被插入了");
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
