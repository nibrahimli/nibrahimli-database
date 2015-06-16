package com.nibrahimli.database.backoffice.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.backoffice.dao.UserDao;
import com.nibrahimli.database.backoffice.entity.User;
import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao {

	public UserDaoImpl() {
		super(User.class);
	}
}
