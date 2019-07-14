package com.bs.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.bs.dto.BookDTO;
import com.bs.mapper.BookRowMapper;

public class BookStoreDao {

	private JdbcTemplate jt;

	private static final String INSERT_SQL = "insert into book_store(book_id,book_name,book_price,book_isbn,author_name) values(?,?,?,?,?)";
	private static final String DELETE_BY_ID = "DELETE FROM BOOK_STORE WHERE BOOK_ID= ?";
	private static final String UPDATE_PRICE_BY_ID = "UPDATE BOOK_STORE SET BOOK_PRICE=? WHERE BOOK_ID=?";
	private static final String FIND_BY_ID = "SELECT * FROM BOOK_STORE WHERE BOOK_ID=?";
	private static final String FIND_ALL = "SELECT * FROM BOOK_STORE";
	private static final String FIND_BY_AUTHOR_NAME = "SELECT * FROM BOOK_STORE WHERE AUTHOR_NAME = ?";

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public boolean insert(BookDTO dto) {
		int cnt = jt.update(INSERT_SQL, dto.getBookId(), dto.getBookName(), dto.getPrice(), dto.getIsbn(),
				dto.getAuthorName());
		if (cnt > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean insertWithPstmt(BookDTO dto) {
		int cnt = jt.update(INSERT_SQL, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, dto.getBookId());
				pstmt.setString(2, dto.getBookName());
				pstmt.setDouble(3, dto.getPrice());
				pstmt.setString(4, dto.getIsbn());
				pstmt.setString(5, dto.getAuthorName());
			}
		});
		return true;
	}

	public boolean deleteById(Integer bookId) {
		int cnt = jt.update(DELETE_BY_ID, bookId);
		if (cnt > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean updatePriceById(Integer bookId, Double price) {
		int cnt = jt.update(UPDATE_PRICE_BY_ID, price, bookId);
		return (cnt > 0) ? true : false;
	}

	public void queryForMap(int bookId) {
		Map<String, Object> dataMap = jt.queryForMap(FIND_BY_ID, bookId);
		System.out.println(dataMap);
	}

	public void queryForList() {
		List<Map<String, Object>> allRecords = jt.queryForList(FIND_ALL);
		for (Map<String, Object> map : allRecords) {
			System.out.println(map);
		}
	}

	public BookDTO findById(Integer bookId) {
		return jt.queryForObject(FIND_BY_ID, new Object[] { bookId }, new BookRowMapper());
	}

	public List<BookDTO> findAll() {
		return jt.query(FIND_ALL, new BookRowMapper());
	}

	public List<BookDTO> findByAutorName(String authorName) {
		return jt.query(FIND_BY_AUTHOR_NAME, new Object[] { authorName }, new BookRowMapper());
	}

	public void insertBooksUsingBatch(List<BookDTO> books) {
		jt.batchUpdate(INSERT_SQL, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt, int index) throws SQLException {
				BookDTO book = books.get(index);
				pstmt.setInt(1, book.getBookId());
				pstmt.setString(2, book.getBookName());
				pstmt.setDouble(3, book.getPrice());
				pstmt.setString(4, book.getIsbn());
				pstmt.setString(5, book.getAuthorName());
			}

			@Override
			public int getBatchSize() {
				return books.size();
			}
		});
	}

}
