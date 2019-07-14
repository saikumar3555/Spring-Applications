package com.sjc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sjc.dao.BookStoreDao;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sjc/cfg/Persistence-Beans.xml");
		BookStoreDao dao = ctx.getBean("dao", BookStoreDao.class);
		/*String name = dao.getNameById(102);
		System.out.println("Book Name : " + name);*/
		
		dao.getBooksByPrice(450.00);
	}

}
