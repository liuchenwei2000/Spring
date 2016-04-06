/**
 * 
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
@Repository
public class HibernatePersonDao implements PersonDao {

	// 直接使用 SessionFactory
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		// 通过 SessionFactory 获得当前事务的 Session
		return getSessionFactory().getCurrentSession();
	}


	@Override
	public void save(Person person) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Person person) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(person);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Person person) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(person);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Person find(Long id) {
		return (Person) getSessionFactory().openSession().get(Person.class, id);
	}
}
