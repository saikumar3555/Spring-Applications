package com.ifm.beans;

public class DaoFactory implements IDao {

	@Override
	public Object getInstance() {
		System.out.println("Preparing DataSource");
		System.out.println("preparing JDBCTemplate");
		return new DeptDao();
	}
}
