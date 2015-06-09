package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.UserDao;
import com.nibrahimli.database.blog.entity.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao{

	public UserDaoImpl() {
		super(User.class);
	}
	
}
