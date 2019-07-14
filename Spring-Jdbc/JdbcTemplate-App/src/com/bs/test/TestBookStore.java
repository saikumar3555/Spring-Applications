package com.bs.test;

import java.io.File;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bs.dao.BookStoreDao;
import com.bs.dto.BookDTO;
import com.bs.reader.BookCSVReader;

public class TestBookStore {
	public static void main(String[] args) throws Exception{
		// Storing data in Dto obj
		/*BookDTO dto = new BookDTO();
		dto.setBookId(103);
		dto.setBookName("WebServices");
		dto.setAuthorName("Richard");
		dto.setIsbn("ISBN002");
		dto.setPrice(550.00);*/

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bs/cfg/Persistence-Beans.xml");
		BookStoreDao dao = ctx.getBean("bsdao", BookStoreDao.class);
		// boolean status = dao.insert(dto);
		// boolean status = dao.insertWithPstmt(dto);
		// System.out.println("Record inserted ? : " + status);

		// boolean isDeleted = dao.deleteById(103);
		// System.out.println("Record Deleted ? :"+isDeleted);

		// boolean isUpdated = dao.updatePriceById(102, 350.00);
		// System.out.println("Record Updated ? : "+isUpdated);
		// dao.queryForMap(101);
		
		//dao.queryForList();
		
		//BookDTO dto = dao.findById(101);
		//System.out.println(dto);
		
		//List<BookDTO> dtos = dao.findAll();
		
		//List<BookDTO> dtos = dao.findByAutorName("Rod Johnson");
		
		List<BookDTO> books = BookCSVReader.readCSVData(new File("Book-Details.csv"));
		dao.insertBooksUsingBatch(books);
	}
}
