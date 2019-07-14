package com.bs.model;

public class Book {

	private Integer bookId;
	private String bookName;
	private String autorName;
	private String isbn;
	private Double price;

	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(Integer bookId, String bookName, String autorName, String isbn, Double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.autorName = autorName;
		this.isbn = isbn;
		this.price = price;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAutorName(String autorName) {
		this.autorName = autorName;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAutorName() {
		return autorName;
	}

	public String getIsbn() {
		return isbn;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", autorName=" + autorName + ", isbn=" + isbn
				+ ", price=" + price + "]";
	}

}
