package com.aits.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aits.entity.Emp;
import com.aits.service.EmpService;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aits/cfg/Beans.xml");
		EmpService service = context.getBean(EmpService.class);

		/**
		 * Saving Entity
		 */
		Emp emp = new Emp("Ashok", "ashokb@oracle.com", 45000.00);
		service.save(emp);

		/**
		 * Retrivieng Entity by ID
		 */
		// System.out.println(service.findByid(102));

		/**
		 * Retriving all entites
		 */
		List<Emp> emps = service.findAll();

		for (Emp e : emps) {
			System.out.println(e);
		}

	}

}
