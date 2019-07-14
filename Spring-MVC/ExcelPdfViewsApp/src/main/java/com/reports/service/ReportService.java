package com.reports.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.reports.model.Product;

@Service("reportService")
public class ReportService {

	public List<Product> getProductsData() {

		List<Product> products = new ArrayList<Product>();

		products.add(new Product(101, "Mouse", 1000.00));
		products.add(new Product(102, "Hard Disk", 5000.00));
		products.add(new Product(101, "Keyboard", 1500.00));

		return products;
	}

}
