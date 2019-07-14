package com.bs.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.bs.dto.BookDTO;

public class BookCSVReader {

	public static List<BookDTO> readCSVData(File f) throws Exception {
		List<BookDTO> books = new ArrayList<>();

		// Loading file and connecting to BufferedReader
		BufferedReader br = new BufferedReader(new FileReader(f));

		// Reading first line from the file
		String line = br.readLine();

		// If file is not empty - processing
		while (line != null) {
			// Process line data
			String[] bookData = line.split(",");

			// Add line data to BookDTO obj
			BookDTO dto = new BookDTO();
			dto.setBookId(Integer.parseInt(bookData[0]));
			dto.setBookName(bookData[1]);
			dto.setIsbn(bookData[2]);
			dto.setPrice(Double.parseDouble(bookData[3]));
			dto.setAuthorName(bookData[4]);

			// Add BookDTO to collection
			books.add(dto);

			// read next line
			line = br.readLine();
		}

		return books;
		
	}

}
