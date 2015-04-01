/**
 * 
 */
package hibernate;

import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * ����HibernateTemplate��PersonDaoʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public class HibernatePersonDao implements PersonDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Person person) {
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
