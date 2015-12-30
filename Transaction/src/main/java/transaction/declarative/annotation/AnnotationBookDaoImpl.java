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
 * 使用注解实现声明式事务控制的BookDao实现
 * <p>
 * 注解允许你在代码中，而不是外部配置文件中直接定义元数据，非常适于声明事务。
 * <p>
 * @Transactional 注解也可以被应用到一个接口（或接口方法）上，指明该接口的所有实现都应该被事务化。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年12月5日
 */
// 类层次的注解
@Transactional
public class AnnotationBookDaoImpl extends JdbcDaoSupport implements BookDao {

	private static final String SQL_SAVE = "insert into book(isbn,name,author) values(?,?,?)";
	
	// 方法层次的注解，同时设置事务参数
	@Transactional(propagation=Propagation.REQUIRED)
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
