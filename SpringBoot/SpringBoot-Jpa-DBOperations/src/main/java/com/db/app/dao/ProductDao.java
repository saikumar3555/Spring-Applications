package com.db.app.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.db.app.entities.Product;

@Repository("prodDao")
public interface ProductDao extends JpaRepository<Product, Serializable> {

	@Query("select pname from Product")
	public List<String> findProductNames();
}
