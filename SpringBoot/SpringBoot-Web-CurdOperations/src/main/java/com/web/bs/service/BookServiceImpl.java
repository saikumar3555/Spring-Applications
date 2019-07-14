package com.web.bs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.web.bs.dao.BookDao;
import com.web.bs.entity.BookEntity;
import com.web.bs.model.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired(required = true)
	private BookDao bookDao;

	@Override
	public boolean insert(Book book) {

		// Converting model obj to entity obj
		BookEntity entity = new BookEntity();
		entity.setBookName(book.getBname());
		entity.setBookIsbn(book.getIsbn());
		entity.setBookPrice(book.getPrice());
		entity.setActiveSw("Y");

		// calling dao method
		BookEntity be = bookDao.save(entity);

		return (be.getBookId() != null) ? true : false;
	}

	@Override
	public List<Book> findAllBooks() {
		List<BookEntity> entities = bookDao.findAll();
		List<Book> books = new ArrayList<Book>();

		if (!entities.isEmpty()) {
			for (BookEntity entity : entities) {
				if ("Y".equals(entity.getActiveSw())) {
					Book b = new Book();

					b.setBid(entity.getBookId());
					b.setBname(entity.getBookName());
					b.setIsbn(entity.getBookIsbn());
					b.setPrice(entity.getBookPrice());

					books.add(b);
				}
			}
		}
		return books;
	}

	/**
	 * This method performs soft delete
	 * 
	 * @param bid
	 * @return
	 */
	public boolean delete(Integer bid) {
		BookEntity entity = bookDao.findOne(bid);
		entity.setActiveSw("N");
		BookEntity be = bookDao.save(entity);
		return (be != null) ? true : false;
	}

	@Override
	public Book edit(Integer bid) {
		BookEntity entity = bookDao.findOne(bid);

		// Converting entity to model obj
		Book b = new Book();
		b.setBid(entity.getBookId());
		b.setBname(entity.getBookName());
		b.setIsbn(entity.getBookIsbn());
		b.setPrice(entity.getBookPrice());

		return b;
	}

	public boolean update(Book b) {
		
		BookEntity entity = bookDao.findOne(b.getBid());
		
		entity.setBookIsbn(b.getIsbn());
		entity.setBookName(b.getBname());
		entity.setBookPrice(b.getPrice());

		BookEntity be = bookDao.save(entity);

		return (be != null) ? true : false;
	}

}
