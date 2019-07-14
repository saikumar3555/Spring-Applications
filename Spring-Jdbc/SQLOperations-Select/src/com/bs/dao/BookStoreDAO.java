package com.bs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import com.bs.model.Book;

public class BookStoreDAO {

	private static final String FIND_BOOK_BY_NAME = "SELECT * FROM BOOK_STORE WHERE BOOK_NAME LIKE ?";
	private DataSource ds;

	public List<Book> findBooksByName(String bookName) {
		SelectBook sb = new SelectBook(ds, FIND_BOOK_BY_NAME);
		return sb.getBookByName(bookName);
	}

	private final class SelectBook extends MappingSqlQuery<Book> {

		public SelectBook(DataSource ds, String sql) {
			super(ds, FIND_BOOK_BY_NAME);
			declareParameter(new SqlParameter(Types.VARCHAR));
			compile();
		}

		@Override
		protected Book mapRow(ResultSet rs, int index) throws SQLException {
			Book b = new Book();
			b.setBookId(rs.getInt(1));
			b.setAutorName(rs.getString(2));
			b.setBookName(rs.getString(3));
			b.setPrice(rs.getDouble(4));
			b.setIsbn(rs.getString(5));
			return b;
		}

		public List<Book> getBookByName(String name) {
			return execute("%" + name + "%");
		}
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

}
