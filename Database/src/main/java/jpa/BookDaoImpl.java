/**
 * 
 */
package jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 使用 SessionFactory 的 PersonDao
 * <p>
 * 使用 Hibernate 的主要接口是 org.hibernate.Session。
 * 该接口提供了基本的数据访问功能（CRUD），使得应用程序的 DAO 能够满足所有的持久化需求。
 * SessionFactory 主要负责 Hibernate Session 的打开、关闭以及管理。
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
		entityManager.remove(book);
	}

	@Override
	public Book find(Long id) {
		return entityManager.find(Book.class, id);
	}
}
