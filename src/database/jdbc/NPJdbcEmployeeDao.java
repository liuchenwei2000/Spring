/**
 * 
 */
package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * 基于NamedParameterJdbcTemplate的EmployeeDao实现
 * <p>
 * JdbcTemplate使用了索引参数，在把参数传递给update()方法时，必须注意参数值的次序。
 * 如果在修改SQL时不得不改变参数的次序，那么值的次序也必须随之改变。
 * 为了避免这种情况，可以使用命名参数，给SQL里的每个参数赋予一个名称，这样参数的次序就没必要保持一致了。
 * NamedParameterJdbcTemplat支持命名参数。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public class NPJdbcEmployeeDao implements EmployeeDao {

	private NamedParameterJdbcTemplate npJdbcTemplate;

	public NamedParameterJdbcTemplate getNpJdbcTemplate() {
		return npJdbcTemplate;
	}

	public void setNpJdbcTemplate(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	// 使用 :name 的方式作为命名参数
	private static final String SQL_SAVE = "insert into employee(name,email,age) values(:name,:email,:age)";
	
	public void save(Employee employee) {
		// 构造 Map 绑定各个参数值
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("name", employee.getName());
		parameters.put("email", employee.getEmail());
		parameters.put("age", employee.getAge());
		
		getNpJdbcTemplate().update(SQL_SAVE, parameters);
	}
	
	private static final String SQL_UPDATE = "update employee set email=:email,age=:age where name=:name";

	public void update(Employee employee) {
		getNpJdbcTemplate().update(SQL_UPDATE, createParameters(employee));
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
		getNpJdbcTemplate().update(SQL_DELETE, createParameters(employee));
	}

	private static final String SQL_QUERY = "select name,email,age from employee where name=:name";
	
	public Employee find(String name) {
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("name", name);
		
		List<Employee> result = getNpJdbcTemplate().query(SQL_QUERY,
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
