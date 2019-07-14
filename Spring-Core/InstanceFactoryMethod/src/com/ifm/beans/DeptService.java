package com.ifm.beans;

public class DeptService {
	
	private DeptDao dao;
	
	public void save(int id,String name){
		dao.insert(id, name);
	}

	public void setDao(DeptDao dao) {
		this.dao = dao;
	}
	
	

}
