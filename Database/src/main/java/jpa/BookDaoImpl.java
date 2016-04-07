/**
 * 
 */
package jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 不使用 Spring 模板的纯 JPA DAO
 * <p>
 *
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月2日
 */
@Repository("bookDao")
@Transactional
public class BookDaoImpl implements BookDao {

	@PersistenceContext
	private EntityManager entityManager;// 注入 EntityManager

	@Override
	public void save(Book book) {
		entityManager.persist(book);
	}

	@Override
	public void update(Book book) {
		entityManager.merge(book);
	}

	@Override
	public void delete(Book book) {
		// 这么写是为了解决 InvalidDataAccessApiUsageException: Removing a detached instance
		entityManager.remove(entityManager.contains(book) ? book : entityManager.merge(book));
	}

	@Override
	public Book find(Long id) {
		return entityManager.find(Book.class, id);
	}
}
