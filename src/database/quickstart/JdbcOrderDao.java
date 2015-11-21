/**
 * 
 */
package quickstart;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 基于JDBC实现的DAO
 * <p>
 * Spring提供了多个DAO支持类，分别对应于每个模板。
 * 可以继承这些DAO支持类，派生出我们自己的DAO类，并且调用模板来直接获取底层的数据访问模板。
 * 如果需要访问底层持久平台，每个DAO支持类都能够访问它与数据库进行通信所用的类。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月28日
 */
public class JdbcOrderDao extends JdbcDaoSupport implements OrderDAO {

	@Override
	public String insert(Order order) {
		// 获取数据访问模板
		getJdbcTemplate().execute("insert ...");
		// 获取访问底层持久平台的对象
		getConnection();
		return "";
	}

	@Override
	public void update(Order order) {
		getJdbcTemplate().execute("update ...");
	}

	@Override
	public void delete(Order order) {
		getJdbcTemplate().execute("delete ...");
	}

	@Override
	public Order find(String id) {
		getJdbcTemplate().execute("select ...");
		return null;
	}
}
