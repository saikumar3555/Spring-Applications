package com.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orm.dao.EmpDao;
import com.orm.entity.Emp;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired(required = true)
	private EmpDao empDao;

	public List<Emp> findAll() {
		return empDao.findAll();
	}

	public Emp findByid(int eid) {
		return empDao.findByid(eid);
	}

	public boolean save(Emp entity) {
		return empDao.save(entity);
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

}
