package com.aits.service;

import com.aits.entity.Emp;

public interface EmpService {
	public boolean save(Emp entity);

	public Emp findByid(int eid);

	public java.util.List<Emp> findAll();
}
