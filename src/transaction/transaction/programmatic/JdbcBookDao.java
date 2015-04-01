/**
 * 
 */
package transaction.programmatic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import transaction.Book;
import transaction.BookDao;

/**
 * ��������Ƶ�BookDaoʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��30��
 */
public class JdbcBookDao extends JdbcDaoSupport implements BookDao {

	// ����Spring��TransactionTemplateΪ��������������������
	private TransactionTemplate transactionTemplate;

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	private static final String SQL_SAVE = "insert into book(isbn,name,author) values(?,?,?)";
	
	public void save(final Book book) {
		getTransactionTemplate().execute(new TransactionCallback<Book>() {

			/**
			 * �÷�����ʾһ��������������ɹ����أ���ô�������㽫���ύ��
			 * 
			 * @see org.springframework.transaction.support.TransactionCallback#doInTransaction(org.springframework.transaction.TransactionStatus)
			 */
			@Override
			public Book doInTransaction(TransactionStatus status) {
				try {
					boolean existed = find(book.getName()) != null;
					
					getJdbcTemplate().update(SQL_SAVE,
							new Object[] { book.getIsbn(), book.getName(), book.getAuthor() });
					// ���⽫������ظ�У�����ڱ��涯��֮���Բ��Իع�����
					if (existed) {
						throw new RuntimeException(book.getName() + " �Ѵ���.");
					}
				} catch (Exception e) {
					e.printStackTrace();
					status.setRollbackOnly();// �����쳣ʱ�ع�
				}
				return null;
			}
		});
	}
	
	private static final String SQL_QUERY = "select isbn,name,author from book where name=?";
	
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
	
	public void deleteAll() {
		getTransactionTemplate().execute(new TransactionCallback<Book>() {

			@Override
			public Book doInTransaction(TransactionStatus status) {
				getJdbcTemplate().execute(SQL_DELETE_ALL);
				return null;
			}
		});
	}
}
