package com.web.bs.service;

import java.util.List;

import com.web.bs.model.Book;

public interface BookService {

	public boolean insert(Book book);

	public List<Book> findAllBooks();
	
	public boolean delete(Integer bid);
	
	public Book edit(Integer bid);
	
	public boolean update(Book b);

}
