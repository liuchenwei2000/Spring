/**
 * 
 */
package quickstart;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * ����Hibernateʵ�ֵ�DAO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��28��
 */
public class HibernateOrderDao extends HibernateDaoSupport implements OrderDAO {

	@Override
	public String insert(Order order) {
		// ��ȡ���ݷ���ģ��
		getHibernateTemplate().persist(order);
		// ��ȡ���ʵײ�־�ƽ̨�Ķ���
		// getSessionFactory();
		return "";
	}

	@Override
	public void update(Order order) {
		getHibernateTemplate().persist(order);
	}

	@Override
	public void delete(Order order) {
		getHibernateTemplate().delete(order);
	}

	@Override
	public Order find(String id) {
		return getHibernateTemplate().load(Order.class, id);
	}
}
