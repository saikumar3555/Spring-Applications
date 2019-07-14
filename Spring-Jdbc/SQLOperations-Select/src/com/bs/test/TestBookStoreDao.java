package com.bs.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bs.dao.BookStoreDAO;
import com.bs.model.Book;

public class TestBookStoreDao {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bs/cfg/Beans.xml");
		BookStoreDAO dao = context.getBean("dao", BookStoreDAO.class);
		List<Book> books = dao.findBooksByName("Spring");
		if (!books.isEmpty()) {
			for (Book b : books) {
				System.out.println(b);
			}
		}
	}

}
