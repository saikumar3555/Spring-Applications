package com.nit.books.dao;

import com.nit.books.entity.UserEntity;

public interface UserDao {

	public Integer insert(UserEntity userEntity);
	public UserEntity find(Integer uid);
	public UserEntity find(String uname,String pwd);
}
