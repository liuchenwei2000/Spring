/**
 * 
 */
package transaction;

/**
 * BookDao
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public interface BookDao {

	public void save(Book book);
	
	public Book find(String name);
	
	public void deleteAll();
}
