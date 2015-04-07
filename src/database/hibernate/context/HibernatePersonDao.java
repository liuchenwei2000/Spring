/**
 * 
 */
package hibernate.context;

import hibernate.Person;
import hibernate.PersonDao;

import org.hibernate.SessionFactory;

/**
 * 使用SessionFactory的PersonDao
 * <p>
 * HibernateTemplate的功能之一是管理Hibernate会话，包括打开和关闭会话，以及确保每个事务一个会话。
 * HibernateTemplate的缺点是具有一定的侵入性，使用它的代码被耦合到Spring API中。
 * Hibernate3引入的SessionFactory可以管理每个事务一个会话，也就不需要HibernateTemplate，并能够避免Spring API的代码入侵。
 * 这种方式的缺点是，它们抛出Hibernate特有的异常，而不是像Spring持久异常体系那样与ORM无关的异常。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月2日
 */
public class HibernatePersonDao implements PersonDao {

	// 直接使用SessionFactory
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Person person) {
		// 通过SessionFactory获得会话对象
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
