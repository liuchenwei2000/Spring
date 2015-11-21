/**
 * 
 */
package transaction.declarative;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import transaction.Book;
import transaction.BookDao;

/**
 * 没有事务控制的BookDao实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月5日
 */
public class BookDaoImpl extends JdbcDaoSupport implements BookDao {

	private static final String SQL_SAVE = "insert into book(isbn,name,author) values(?,?,?)";
	
	public void save(final Book book) {
		boolean existed = find(book.getName()) != null;

		getJdbcTemplate()
				.update(SQL_SAVE,
						new Object[] { book.getIsbn(), book.getName(),
								book.getAuthor() });
		// 故意将下面的重复校验置于保存动作之后，以测试回滚功能
		if (existed) {
			throw new RuntimeException(book.getName() + " 已存在.");
		}
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
		getJdbcTemplate().execute(SQL_DELETE_ALL);
	}
}
