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
public class Reader {

	private String name;
	private Book book;

	public Reader() {
		super();
		System.out.println("����һ��Readerʵ��");
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
		System.out.println("ΪReaderʵ��ע��һ��Bookʵ��");
	}

	@Override
	public String toString() {
		return "Reader [name=" + name + ", book=" + book.getName() + "]";
	}
}