/**
 * 
 */
package jdbc.daosupport;

import jdbc.Employee;
import jdbc.EmployeeDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 继承 NamedParameterJdbcDaoSupport 的 EmployeeDao 实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public class NPJdbcEmployeeDao extends NamedParameterJdbcDaoSupport implements EmployeeDao {

	private static final String SQL_SAVE = "insert into employee(name,email,age) values(:name,:email,:age)";
	
	public void save(Employee employee) {
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("name", employee.getName());
		parameters.put("email", employee.getEmail());
		parameters.put("age", employee.getAge());
		// 直接通过父类的 getNamedParameterJdbcTemplate() 获取 NamedParameterJdbcTemplate 实例
		getNamedParameterJdbcTemplate().update(SQL_SAVE, parameters);
	}
	
	private static final String SQL_UPDATE = "update employee set email=:email,age=:age where name=:name";

	public void update(Employee employee) {
		getNamedParameterJdbcTemplate().update(SQL_UPDATE, createParameters(employee));
	}

	private Map<String, Object> createParameters(Employee employee) {
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("name", employee.getName());
		parameters.put("email", employee.getEmail());
		parameters.put("age", employee.getAge());
		return parameters;
	}
	
	private static final String SQL_DELETE = "delete from employee where name=:name";

	public void delete(Employee employee) {
		getNamedParameterJdbcTemplate().update(SQL_DELETE, createParameters(employee));
	}

	private static final String SQL_QUERY = "select name,email,age from employee where name=:name";
	
	public Employee find(String name) {
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("name", name);
		
		List<Employee> result = getNamedParameterJdbcTemplate().query(SQL_QUERY,
				parameters, new RowMapper<Employee>() {

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
