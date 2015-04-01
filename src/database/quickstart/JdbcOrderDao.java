/**
 * 
 */
package quickstart;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * ����JDBCʵ�ֵ�DAO
 * <p>
 * Spring�ṩ�˶��DAO֧���࣬�ֱ��Ӧ��ÿ��ģ�塣
 * ���Լ̳���ЩDAO֧���࣬�����������Լ���DAO�࣬���ҵ���ģ����ֱ�ӻ�ȡ�ײ�����ݷ���ģ�塣
 * �����Ҫ���ʵײ�־�ƽ̨��ÿ��DAO֧���඼�ܹ������������ݿ����ͨ�����õ��ࡣ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��28��
 */
public class JdbcOrderDao extends JdbcDaoSupport implements OrderDAO {

	@Override
	public String insert(Order order) {
		// ��ȡ���ݷ���ģ��
		getJdbcTemplate().execute("insert ...");
		// ��ȡ���ʵײ�־�ƽ̨�Ķ���
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
