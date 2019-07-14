package com.nit.lib.dao;

import com.nit.lib.entity.UserEntity;

public interface UserDao {

	public boolean insert(UserEntity userEntity);

	public UserEntity find(UserEntity userEntity);

}
