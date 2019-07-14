package com.bs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bs.dao.BookStoreDAO;

public class TestBookStoreDao {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bs/cfg/Beans.xml");
		BookStoreDAO dao = context.getBean("dao", BookStoreDAO.class);
		dao.updatePriceById(350.00, 105);
	}

}
