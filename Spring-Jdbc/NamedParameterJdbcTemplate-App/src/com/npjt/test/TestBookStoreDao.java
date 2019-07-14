package com.npjt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npjt.dao.BookStoreDao;
import com.npjt.dto.BookDTO;

public class TestBookStoreDao {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/npjt/cfg/Persistence-Beans.xml");
		BookStoreDao dao = ctx.getBean("dao", BookStoreDao.class);

		/*BookDTO dto = new BookDTO();
		dto.setBookId(101);
		dto.setBookName("Spring");
		dto.setPrice(550.00);
		dto.setIsbn("ISBN001");
		dto.setAuthorName("Rod Johnson");

		boolean isInserted = dao.insert(dto);
		System.out.println("Record Inserted ? : " + isInserted);
		*/
		
		/*BookDTO book = dao.findById(101);
		System.out.println(book);*/

		
		BookDTO dto1 = new BookDTO();
		dto1.setBookId(101);
		dto1.setBookName("Spring");
		dto1.setPrice(550.00);
		dto1.setIsbn("ISBN001");
		dto1.setAuthorName("Rod Johnson");
		
		BookDTO dto2 = new BookDTO();
		dto2.setBookId(102);
		dto2.setBookName("Spring");
		dto2.setPrice(550.00);
		dto2.setIsbn("ISBN001");
		dto2.setAuthorName("Rod Johnson");
		
		List<BookDTO> books = new ArrayList();
		books.add(dto1);
		books.add(dto2);
		
		dao.insertUsingBatch(books);
		
	}

}
