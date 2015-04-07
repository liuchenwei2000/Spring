/**
 * 
 */
package hibernate.context;

import hibernate.Person;
import hibernate.PersonDao;

import org.hibernate.SessionFactory;

/**
 * ʹ��SessionFactory��PersonDao
 * <p>
 * HibernateTemplate�Ĺ���֮һ�ǹ���Hibernate�Ự�������򿪺͹رջỰ���Լ�ȷ��ÿ������һ���Ự��
 * HibernateTemplate��ȱ���Ǿ���һ���������ԣ�ʹ�����Ĵ��뱻��ϵ�Spring API�С�
 * Hibernate3�����SessionFactory���Թ���ÿ������һ���Ự��Ҳ�Ͳ���ҪHibernateTemplate�����ܹ�����Spring API�Ĵ������֡�
 * ���ַ�ʽ��ȱ���ǣ������׳�Hibernate���е��쳣����������Spring�־��쳣��ϵ������ORM�޹ص��쳣��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��2��
 */
public class HibernatePersonDao implements PersonDao {

	// ֱ��ʹ��SessionFactory
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Person person) {
		// ͨ��SessionFactory��ûỰ����
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
