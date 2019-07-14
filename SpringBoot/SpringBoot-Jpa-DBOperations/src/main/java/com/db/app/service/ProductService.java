package com.db.app.service;

import java.io.Serializable;
import java.util.List;

import com.db.app.entities.Product;

public interface ProductService {

	public Serializable insert(Product p);

	public Product findProductById(Integer pid);

	public List<Product> findAllProducts();
	
	public List<String> findAllProductNames();

}
