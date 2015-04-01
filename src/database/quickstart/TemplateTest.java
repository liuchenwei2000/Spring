/**
 * 
 */
package quickstart;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * 数据访问的模板化
 * <p>
 * 模板方法定义过程的架构。Spring把数据访问过程中固定与变化的部分明确地划分为两类：模板和回调。
 * 模板管理过程中的固定部分（如控制事务、管理资源和异常处理），而回调处理自定义的数据访问代码（如创建语句、绑定参数和处理结果）。
 * <p>
 * 针对不同的持久化技术，Spring提供了多个模板类，包括基于JDBC的JdbcTemplate、NameParameterJdbcTemplate、SimpleJdbcTemplate；
 * 基于Hibernate的HibernateTemplate；基于iBatis的SqlMapClientTemplate和基于JPA的JpaTemplate。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月28日
 */
public class TemplateTest {
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
	}
}
