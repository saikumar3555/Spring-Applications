package com.bo.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.bo.model.Book;

public class CSVFileReader {

	public List<Book> readData(String path) throws Exception {

		List<Book> booksList = new ArrayList<Book>();

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {

			// Splitting data using delim
			String[] tokens = line.split(",");

			// Storing line data in model object
			Book b = new Book();
			b.setBookId(Integer.parseInt(tokens[0]));
			b.setAutorName(tokens[1]);
			b.setBookName(tokens[2]);
			b.setPrice(Double.parseDouble(tokens[3]));
			b.setIsbn(tokens[4]);

			// Adding model obj to collection obj
			booksList.add(b);

			// To read next line
			line = br.readLine();
		}
		return booksList;
	}
}
