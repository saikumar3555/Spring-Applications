package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.aspects.ExceptionLogger;
import com.ta.beans.DepartmentDao;

public class TestDeptDao {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new DepartmentDao());
		factory.addAdvice(new ExceptionLogger());

		DepartmentDao dao = (DepartmentDao) factory.getProxy();
		dao.insert();
	}

}
