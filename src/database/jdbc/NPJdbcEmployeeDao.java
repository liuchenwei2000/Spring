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
 * ����NamedParameterJdbcTemplate��EmployeeDaoʵ��
 * <p>
 * JdbcTemplateʹ���������������ڰѲ������ݸ�update()����ʱ������ע�����ֵ�Ĵ���
 * ������޸�SQLʱ���ò��ı�����Ĵ�����ôֵ�Ĵ���Ҳ������֮�ı䡣
 * Ϊ�˱����������������ʹ��������������SQL���ÿ����������һ�����ƣ����������Ĵ����û��Ҫ����һ���ˡ�
 * NamedParameterJdbcTemplat֧������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public class NPJdbcEmployeeDao implements EmployeeDao {

	private NamedParameterJdbcTemplate npJdbcTemplate;

	public NamedParameterJdbcTemplate getNpJdbcTemplate() {
		return npJdbcTemplate;
	}

	public void setNpJdbcTemplate(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	// ʹ�� :name �ķ�ʽ��Ϊ��������
	private static final String SQL_SAVE = "insert into employee(name,email,age) values(:name,:email,:age)";
	
	public void save(Employee employee) {
		// ���� Map �󶨸�������ֵ
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
