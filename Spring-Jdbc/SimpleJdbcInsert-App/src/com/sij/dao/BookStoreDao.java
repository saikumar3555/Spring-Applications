package com.sij.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.sij.dto.BookDTO;

public class BookStoreDao {

	private SimpleJdbcInsert insert;

	public void setInsert(SimpleJdbcInsert insert) {
		this.insert = insert;
	}

	public boolean insert(String tblName, BookDTO dto) {

		// Setting table name
		insert.setTableName(tblName);

		Map<String, Object> tableMap = new HashMap();
		// Storing table info
		tableMap.put("BOOK_ID", dto.getBookId());
		tableMap.put("BOOK_NAME", dto.getBookName());
		tableMap.put("BOOK_ISBN", dto.getIsbn());
		tableMap.put("BOOK_PRICE", dto.getPrice());
		tableMap.put("AUTHOR_NAME", dto.getAuthorName());

		// Executing
		int cnt = insert.execute(tableMap);

		return (cnt > 0) ? true : false;
	}

}
