package com.orm.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orm.entity.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired(required = true)
	private HibernateTemplate hbt;

	@SuppressWarnings("unchecked")
	public List<Emp> findAll() {
		return (List<Emp>) hbt.find("From Emp", null);
	}

	public Emp findByid(int eid) {
		return hbt.get(Emp.class, eid);
	}

	@Transactional(readOnly = false)
	public boolean save(Emp entity) {
		Serializable id = hbt.save(entity);
		if (id != null) {
			return true;
		}
		return false;
	}

	public void setHbt(HibernateTemplate hbt) {
		this.hbt = hbt;
	}

}
