/**
 * 
 */
package bean.adv.fieldretrieving;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月20日
 */
public class Child {

	public static final int DEFAULT_AGE = 6;
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CHild [age=" + age + "]";
	}
}
