/**
 * 
 */
package jdbc.daosupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import jdbc.Employee;
import jdbc.EmployeeDao;

/**
 * �̳�JdbcDaoSupport��EmployeeDaoʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public class JdbcEmployeeDao extends JdbcDaoSupport implements EmployeeDao {

	private static final String SQL_SAVE = "insert into employee(name,email,age) values(?,?,?)";
	
	public void save(Employee employee) {
		// ֱ��ͨ�������getJdbcTemplate()��ȡJdbcTemplateʵ��
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
