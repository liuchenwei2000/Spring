/**
 * 
 */
package bean.instance;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月13日
 */
public class Reader {

	private String name;
	private Book book;

	public Reader() {
		super();
		System.out.println("创建一个Reader实例");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
		System.out.println("为Reader实例注入一个Book实例");
	}

	@Override
	public String toString() {
		return "Reader [name=" + name + ", book=" + book.getName() + "]";
	}
}
