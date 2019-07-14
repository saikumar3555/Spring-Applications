package com.bs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bs.dto.BookDTO;

public class BookRowMapper implements RowMapper<BookDTO> {

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

}
