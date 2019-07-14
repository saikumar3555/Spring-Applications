package com.db.app.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.app.dao.ProductDao;
import com.db.app.entities.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired(required = true)
	private ProductDao prodDao;

	@Override
	public Serializable insert(Product p) {
		System.out.println("service layer:insert method called..!!");
		return prodDao.save(p);
	}

	@Override
	public Product findProductById(Integer pid) {
		return prodDao.findOne(pid);
	}

	@Override
	public List<Product> findAllProducts() {
		return prodDao.findAll();
	}

	@Override
	public List<String> findAllProductNames() {
		return prodDao.findProductNames();
	}
}
