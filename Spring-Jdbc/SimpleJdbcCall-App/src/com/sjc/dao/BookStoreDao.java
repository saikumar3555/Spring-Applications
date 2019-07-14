package com.sjc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class BookStoreDao {

	private SimpleJdbcCall jdbcCall;

	public void setJdbcCall(SimpleJdbcCall jdbcCall) {
		this.jdbcCall = jdbcCall;
	}

	public String getNameById(Integer bid) {
		String name = null;
		// Setting Procedure Name to call
		jdbcCall.setProcedureName("GET_BOOK_NAME_BY_ID");
		// Storing input param details in Map
		Map<String, Object> inParamMap = new HashMap();
		inParamMap.put("BID", bid);
		// Execute the procedure
		Map<String, Object> outParamMap = jdbcCall.execute(inParamMap);
		return (String) outParamMap.get("BNAME");
	}

	public void getBooksByPrice(double price) {

		jdbcCall.setProcedureName("GET_BOOKS_BY_PRICE");

		Map<String, Object> inParamMap = new HashMap();
		inParamMap.put("BPRICE", price);

		Map<String, Object> outParamMap = jdbcCall.execute(inParamMap);
		System.out.println(outParamMap);

	}

}
