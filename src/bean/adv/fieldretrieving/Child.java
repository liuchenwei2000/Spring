/**
 * 
 */
package bean.adv.fieldretrieving;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��20��
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
