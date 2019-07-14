package com.bs.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class BookStoreDAO {

	private static final String UPDATE_BOOK_PRICE_BY_ID = "UPDATE BOOK_STORE SET BOOK_PRICE=? WHERE BOOK_ID=?";
	private DataSource ds;

	public void updatePriceById(double price, int bookId) {
		UpdateBook ub = new UpdateBook(ds, UPDATE_BOOK_PRICE_BY_ID);
		ub.updateBook(price, bookId);
	}

	private final class UpdateBook extends SqlUpdate {

		public UpdateBook(DataSource ds, String sql) {
			super(ds, UPDATE_BOOK_PRICE_BY_ID);
			declareParameter(new SqlParameter(Types.DOUBLE));
			declareParameter(new SqlParameter(Types.INTEGER));
			compile();
		}

		public int updateBook(double price, int bookId) {
			return update(price, bookId);
		}
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

}
