package com.nit.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nit.books.beans.UserBean;
import com.nit.books.dao.UserDao;
import com.nit.books.entity.UserEntity;

@Service
@Transactional(readOnly = false)
public class UserServiceImpl implements UserService {

	@Autowired(required = true)
	private UserDao udao;

	@Override
	@Transactional(readOnly = false)
	public boolean insertUser(UserBean ub) {
		UserEntity uE = new UserEntity();
		uE.setUsername(ub.getUserName());
		uE.setPassword(ub.getPassword());
		System.out.println("Gender : " + ub.getGender());
		uE.setGender(ub.getGender());
		uE.setEmail(ub.getEmail());
		Integer uid = udao.insert(uE);
		if (uid > 0) {
			return true;
		}
		return false;
	}

	@Override
	@Transactional(readOnly = true)
	public UserBean retrieveUser(Integer uid) {
		UserEntity uE = udao.find(uid);
		UserBean ub = new UserBean();
		ub.setEmail(uE.getEmail());
		ub.setUserName(uE.getUsername());
		ub.setPassword(uE.getPassword());
		ub.setUserId(uE.getUserId());
		ub.setGender(uE.getGender());
		return ub;
	}

	@Override
	public boolean loginCheck(UserBean ub) {
		UserEntity ue = udao.find(ub.getUserName(), ub.getPassword());
		if(ue!=null){
			return true;
		}
		return false;
	}
}
