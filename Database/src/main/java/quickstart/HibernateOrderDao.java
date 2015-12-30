/**
 * 
 */
package quickstart;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * 基于Hibernate实现的DAO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月28日
 */
public class HibernateOrderDao extends HibernateDaoSupport implements OrderDAO {

	@Override
	public String insert(Order order) {
		// 获取数据访问模板
		getHibernateTemplate().persist(order);
		// 获取访问底层持久平台的对象
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
