package com.web.bs.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.bs.entity.BookEntity;

/**
 * This interface performs all CURD operations with BOOK_STORE_TBL
 * 
 * @author Ashok
 *
 */
public interface BookDao extends JpaRepository<BookEntity, Serializable> {

}
