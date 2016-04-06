/**
 * 
 */
package jpa;

/**
 * BookDao
 * <p>
 * 提供基本的CRUD操作。
 */
public interface BookDao {

	void save(Book book);
	
	void update(Book book);
	
	void delete(Book book);
	
	Book find(Long id);
}
