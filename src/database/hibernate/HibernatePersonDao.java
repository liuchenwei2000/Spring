/**
 * 
 */
package hibernate;

import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * 基于HibernateTemplate的PersonDao实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
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
