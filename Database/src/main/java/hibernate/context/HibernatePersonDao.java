/**
 * 
 */
package hibernate.context;

import hibernate.Person;
import hibernate.PersonDao;

import org.hibernate.SessionFactory;

/**
 * 使用 SessionFactory 的 PersonDao
 * <p>
 * HibernateTemplate 的功能之一是管理 Hibernate 会话，包括打开和关闭会话，以及确保每个事务一个会话。
 * HibernateTemplate 的缺点是具有一定的侵入性，使用它的代码被耦合到 Spring API 中。
 * Hibernate3 引入的 SessionFactory 可以管理每个事务一个会话，
 * 也就不再需要 HibernateTemplate，并能够避免 Spring API 的代码入侵。
 * 这种方式的缺点是，它们抛出 Hibernate 特有的异常，而不是像 Spring 持久异常体系那样与 ORM 无关的异常。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月2日
 */
public class HibernatePersonDao implements PersonDao {

	// 直接使用 SessionFactory
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Person person) {
		// 通过 SessionFactory 获得会话对象
		getSessionFactory().getCurrentSession().saveOrUpdate(person);
	}

	@Override
	public void update(Person person) {
		getSessionFactory().getCurrentSession().saveOrUpdate(person);
	}

	@Override
	public void delete(Person person) {
		getSessionFactory().getCurrentSession().delete(person);
	}

	@Override
	public Person find(Long id) {
		return (Person) getSessionFactory().getCurrentSession().load(Person.class, id);
	}
}
