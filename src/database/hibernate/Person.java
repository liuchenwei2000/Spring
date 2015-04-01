/**
 * 
 */
package hibernate;

/**
 * Person
 * <p>
 * POJO����Ӧ���ݿ�� person ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��1��
 */
public class Person {

	private Long id;
	
	private String name;
	private String email;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "Person [name=" + name + ", email=" + email + ", age=" + age
				+ "]";
	}
}
