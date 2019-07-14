package com.nit.lib.service;

import com.nit.lib.beans.UserBean;

public interface UserService {

	public boolean insertUser(UserBean ub);

	public UserBean retrieveUser(UserBean ub);

}
