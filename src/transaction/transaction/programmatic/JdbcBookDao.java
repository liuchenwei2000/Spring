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
 * 有事务控制的BookDao实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月30日
 */
public class JdbcBookDao extends JdbcDaoSupport implements BookDao {

	// 利用Spring的TransactionTemplate为程序添加事务管理能力。
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
			 * 该方法表示一个事务，如果方法成功返回，那么这个事务便将被提交。
			 * 
			 * @see org.springframework.transaction.support.TransactionCallback#doInTransaction(org.springframework.transaction.TransactionStatus)
			 */
			@Override
			public Book doInTransaction(TransactionStatus status) {
				try {
					boolean existed = find(book.getName()) != null;
					
					getJdbcTemplate().update(SQL_SAVE,
							new Object[] { book.getIsbn(), book.getName(), book.getAuthor() });
					// 故意将下面的重复校验置于保存动作之后，以测试回滚功能
					if (existed) {
						throw new RuntimeException(book.getName() + " 已存在.");
					}
				} catch (Exception e) {
					e.printStackTrace();
					status.setRollbackOnly();// 出现异常时回滚
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
