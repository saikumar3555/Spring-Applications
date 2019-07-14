package com.orm.dao;

import com.orm.entity.Emp;


public interface EmpDao {

	public boolean save(Emp entity);

	public Emp findByid(int eid);

	public java.util.List<Emp> findAll();

}
