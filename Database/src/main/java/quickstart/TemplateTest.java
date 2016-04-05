/**
 * 
 */
package quickstart;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * 数据访问的模板化
 * <p>
 * Spring 把数据访问过程中固定与变化的部分明确地划分为两类：模板（template）和回调（callback）。
 * 模板管理过程中的固定部分（如控制事务、管理资源和异常处理），而回调处理自定义的数据访问代码（如创建语句、绑定参数和处理结果）。
 * <p>
 * 针对不同的持久化技术，Spring 提供了多个模板类，包括：
 * JdbcTemplate：JDBC 连接
 * NameParameterJdbcTemplate：支持命名参数的 JDBC 连接
 * SimpleJdbcTemplate；通过 Java5 简化后的 JDBC 连接
 * HibernateTemplate；基于 Hibernate 的 Session
 * SqlMapClientTemplate：基于 MyBatis 的 SQLMap 客户端
 * JpaTemplate：基于 JPA 的实体管理器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月28日
 */
public class TemplateTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.execute("insert ...");
		
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.persist(new Order());
	}
}
