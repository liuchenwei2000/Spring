/**
 * 
 */
package hibernate.daosupport;

import hibernate.Person;
import hibernate.PersonDao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * �̳�HibernateDaoSupport��PersonDaoʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public class HibernatePersonDao extends HibernateDaoSupport implements PersonDao {

	@Override
	public void save(Person person) {
		// ֱ��ͨ�������getHibernateTemplate()��ȡHibernateTemplate����
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
