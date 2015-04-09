/**
 * 
 */
package transaction.declarative.annotation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import transaction.Book;
import transaction.BookDao;

/**
 * ʹ��ע��ʵ������ʽ������Ƶ�BookDaoʵ��
 * <p>
 * ע���������ڴ����У��������ⲿ�����ļ���ֱ�Ӷ���Ԫ���ݣ��ǳ�������������
 * <p>
 * @Transactional ע��Ҳ���Ա�Ӧ�õ�һ���ӿڣ���ӿڷ������ϣ�ָ���ýӿڵ�����ʵ�ֶ�Ӧ�ñ����񻯡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��5��
 */
// ���ε�ע��
@Transactional
public class AnnotationBookDaoImpl extends JdbcDaoSupport implements BookDao {

	private static final String SQL_SAVE = "insert into book(isbn,name,author) values(?,?,?)";
	
	// ������ε�ע�⣬ͬʱ�����������
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(final Book book) {
		boolean existed = find(book.getName()) != null;

		getJdbcTemplate()
				.update(SQL_SAVE,
						new Object[] { book.getIsbn(), book.getName(),
								book.getAuthor() });
		// ���⽫������ظ�У�����ڱ��涯��֮���Բ��Իع�����
		if (existed) {
			throw new RuntimeException(book.getName() + " �Ѵ���.");
		}
	}
	
	private static final String SQL_QUERY = "select isbn,name,author from book where name=?";
	
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Book find(String name) {
		List<Book> result = getJdbcTemplate().query(SQL_QUERY,
				new Object[] { name }, new RowMapper<Book>() {

					@Override
					public Book mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Book book = new Book();
						book.setIsbn(rs.getString(1));
						book.setName(rs.getString(2));
						book.setAuthor(rs.getString(3));
						return book;
					}
				});
		return result.size() > 0 ? result.get(0) : null;
	}
	
	private static final String SQL_DELETE_ALL = "delete from book";

	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE)
	public void deleteAll() {
		getJdbcTemplate().execute(SQL_DELETE_ALL);
	}
}