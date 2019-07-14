package com.nit.books.service;

import com.nit.books.beans.UserBean;

public interface UserService {

	public boolean insertUser(UserBean ub);
	public UserBean retrieveUser(Integer uid);
	public boolean loginCheck(UserBean ub);

}
