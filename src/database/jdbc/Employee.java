/**
 * 
 */
package jdbc;

/**
 * Employee
 * <p>
 * POJO����Ӧ���ݿ�� employee ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
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
