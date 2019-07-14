package com.npjt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import com.npjt.dto.BookDTO;

public class BookStoreDao {

	private static final String INSERT_BOOK = "INSERT INTO BOOK_STORE(BOOK_ID,AUTHOR_NAME,BOOK_NAME,BOOK_PRICE,BOOK_ISBN)"
			+ " VALUES (:bid,:authorName,:bookName,:price,:isbn)";

	private static final String FIND_BY_ID_SQL = "SELECT * FROM BOOK_STORE WHERE BOOK_ID=:BID";

	private NamedParameterJdbcTemplate njt;

	public void setNjt(NamedParameterJdbcTemplate njt) {
		this.njt = njt;
	}

	public boolean insert(BookDTO book) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("BID", book.getBookId());
		map.put("BNAME", book.getBookName());
		map.put("BPRICE", book.getPrice());
		map.put("BISBN", book.getIsbn());
		map.put("BAUTHOR", book.getAuthorName());

		int cnt = njt.update(INSERT_BOOK, map);

		return (cnt > 0) ? true : false;
	}

	public BookDTO findById(Integer bookId) {
		Map<String, Object> params = new HashMap();

		params.put("BID", bookId);

		return njt.queryForObject(FIND_BY_ID_SQL, params, new RowMapper<BookDTO>() {

			@Override
			public BookDTO mapRow(ResultSet rs, int index) throws SQLException {
				BookDTO dto = new BookDTO();
				dto.setBookId(rs.getInt("BOOK_ID"));
				dto.setBookName(rs.getString("BOOK_NAME"));
				dto.setPrice(rs.getDouble("BOOK_PRICE"));
				dto.setIsbn(rs.getString("BOOK_ISBN"));
				dto.setAuthorName(rs.getString("AUTHOR_NAME"));
				return dto;
			}

		});
	}

	public void insertUsingBatch(List<BookDTO> books) {
		SqlParameterSource[] args = SqlParameterSourceUtils.createBatch(books.toArray());
		int[] cnt = njt.batchUpdate(INSERT_BOOK, args);
		System.out.println("Rows Effected : " + cnt);
	}

}
