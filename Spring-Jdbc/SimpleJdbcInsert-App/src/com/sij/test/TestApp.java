package com.sij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sij.dao.BookStoreDao;
import com.sij.dto.BookDTO;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sij/cfg/Persistence-Beans.xml");
		BookStoreDao dao = ctx.getBean("dao", BookStoreDao.class);

		BookDTO dto = new BookDTO();
		dto.setBookId(103);
		dto.setBookName("WebServices");
		dto.setAuthorName("Richard");
		dto.setIsbn("ISBN003");
		dto.setPrice(550.00);

		boolean isInserted = dao.insert("BOOK_STORE", dto);

		System.out.println("Record Inserted ? :" + isInserted);

	}

}
