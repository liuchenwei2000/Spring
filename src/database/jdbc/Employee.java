/**
 * 
 */
package jdbc;

/**
 * Employee
 * <p>
 * POJO，对应数据库的 employee 表。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public class Employee {

	private String name;
	private String email;
	private int age;

	public Employee() {
		super();
	}

	public Employee(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", age=" + age
				+ "]";
	}
}
