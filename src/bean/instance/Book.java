/**
 * 
 */
package bean.instance;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��13��
 */
public class Book {

	private String name;

	public Book() {
		super();
		System.out.println("����һ��Bookʵ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}