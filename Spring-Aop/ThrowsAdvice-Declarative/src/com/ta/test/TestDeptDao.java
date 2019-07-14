package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ta.beans.DepartmentDao;

public class TestDeptDao {

	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("com/ta/cfg/Aop-Beans.xml");
		DepartmentDao dao = ctx.getBean("dao", DepartmentDao.class);
		dao.insert();
	}
}
