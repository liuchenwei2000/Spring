/**
 * 
 */
package hibernate.daosupport;

import hibernate.Person;
import hibernate.PersonDao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * 继承HibernateDaoSupport的PersonDao实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public class HibernatePersonDao extends HibernateDaoSupport implements PersonDao {

	@Override
	public void save(Person person) {
		// 直接通过父类的getHibernateTemplate()获取HibernateTemplate对象
		getHibernateTemplate().saveOrUpdate(person);
	}

	@Override
	public void update(Person person) {
		getHibernateTemplate().saveOrUpdate(person);
	}

	@Override
	public void delete(Person person) {
		getHibernateTemplate().delete(person);
	}

	@Override
	public Person find(Long id) {
		return getHibernateTemplate().load(Person.class, id);
	}
}
