/**
 * 
 */
package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 基于 JdbcTemplate 的 EmployeeDao 实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public class JdbcEmployeeDao implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final String SQL_SAVE = "insert into employee(name,email,age) values(?,?,?)";
	
	public void save(Employee employee) {
		// JdbcTemplate 将获取连接、创建语句并执行插入SQL。
		// 对 SQLException 的处理也被隐藏了，JdbcTemplate 会捕获全部 SQLException，并将其转化成特定 RuntimeException 重新抛出。
		getJdbcTemplate().update(
				SQL_SAVE,
				new Object[] { employee.getName(), employee.getEmail(), employee.getAge() });
	}
	
	private static final String SQL_UPDATE = "update employee set email=?,age=? where name=?";

	public void update(Employee employee) {
		getJdbcTemplate().update(
				SQL_UPDATE,
				new Object[] { employee.getEmail(), employee.getAge(), employee.getName() });
	}
	
	private static final String SQL_DELETE = "delete from employee where name=?";

	public void delete(Employee employee) {
		getJdbcTemplate().update(
				SQL_DELETE,
				new Object[] { employee.getName() });
	}

	private static final String SQL_QUERY = "select name,email,age from employee where name=?";
	
	public Employee find(String name) {
		List<Employee> result = getJdbcTemplate().query(SQL_QUERY,
				new Object[] { name }, new RowMapper<Employee>() {

					/**
					 * RowMapper 对象负责从 ResultSet 里提取数值并构造一个域对象（Domain Object，本例是 Employee）。
					 * 对于查询返回的每一行，JdbcTemplate 都会调用 RowMapper的mapRow() 方法。
					 * 
					 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
					 */
					@Override
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Employee employee = new Employee();
						employee.setName(rs.getString(1));
						employee.setEmail(rs.getString(2));
						employee.setAge(rs.getInt(3));
						return employee;
					}
				});
		return result.size() > 0 ? result.get(0) : null;
	}
}
