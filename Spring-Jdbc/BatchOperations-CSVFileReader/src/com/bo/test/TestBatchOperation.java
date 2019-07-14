package com.bo.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.dao.BookStoreDao;
import com.bo.model.Book;
import com.bo.utils.CSVFileReader;

public class TestBatchOperation {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bo/cfg/Beans.xml");

		BookStoreDao dao = context.getBean("dao", BookStoreDao.class);

		String path = "Books_Data.csv";
		CSVFileReader reader = new CSVFileReader();
		List<Book> books = reader.readData(path);

		if (!books.isEmpty()) {
			dao.insertBooks(books);
		}

	}

}
