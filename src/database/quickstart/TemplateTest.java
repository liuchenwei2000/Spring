/**
 * 
 */
package quickstart;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * ���ݷ��ʵ�ģ�廯
 * <p>
 * ģ�巽��������̵ļܹ���Spring�����ݷ��ʹ����й̶���仯�Ĳ�����ȷ�ػ���Ϊ���ࣺģ��ͻص���
 * ģ���������еĹ̶����֣���������񡢹�����Դ���쳣���������ص������Զ�������ݷ��ʴ��루�紴����䡢�󶨲����ʹ���������
 * <p>
 * ��Բ�ͬ�ĳ־û�������Spring�ṩ�˶��ģ���࣬��������JDBC��JdbcTemplate��NameParameterJdbcTemplate��SimpleJdbcTemplate��
 * ����Hibernate��HibernateTemplate������iBatis��SqlMapClientTemplate�ͻ���JPA��JpaTemplate��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��28��
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
