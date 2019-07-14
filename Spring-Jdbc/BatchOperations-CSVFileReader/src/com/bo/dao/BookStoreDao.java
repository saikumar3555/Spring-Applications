package com.bo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bo.model.Book;

public class BookStoreDao {

	private static final String INSERT_BOOK = "INSERT INTO BOOK_STORE(BOOK_ID,AUTHOR_NAME,BOOK_NAME,BOOK_PRICE,BOOK_ISBN) VALUES (?,?,?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public void insertBooks(List<Book> books) {

		jdbcTemplate.batchUpdate(INSERT_BOOK, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				Book b = books.get(index);
				ps.setInt(1, b.getBookId());
				ps.setString(2, b.getAutorName());
				ps.setString(3, b.getBookName());
				ps.setDouble(4, b.getPrice());
				ps.setString(5, b.getIsbn());
			}

			@Override
			public int getBatchSize() {
				return books.size();
			}
		});
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
