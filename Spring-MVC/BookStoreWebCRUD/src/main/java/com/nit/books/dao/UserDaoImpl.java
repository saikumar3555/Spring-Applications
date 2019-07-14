package com.nit.books.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nit.books.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired(required = true)
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public UserEntity find(Integer uid) {
		return (UserEntity) ht.get(UserEntity.class, uid);
	}

	@Override
	@Transactional(readOnly = false)
	public Integer insert(UserEntity userEntity) {
		return (Integer) ht.save(userEntity);
	}

	@Override
	public UserEntity find(String uname, String pwd) {
		String hql = "FROM UserEntity where username=:uname and password=:pwd";
		List<UserEntity> userEList = (List<UserEntity>) ht.findByNamedParam(
				hql, new String[] { "uname", "pwd" },
				new Object[] { uname, pwd });
		if (userEList.size() > 0) {
			return userEList.get(0);
		}
		return null;
	}
}
