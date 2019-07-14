package com.orm.service;

import com.orm.entity.Emp;

public interface EmpService {
	public boolean save(Emp entity);

	public Emp findByid(int eid);

	public java.util.List<Emp> findAll();
}
