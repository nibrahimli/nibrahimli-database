package com.nibrahimli.database.backoffice.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.backoffice.dao.UserSecurityRoleDao;
import com.nibrahimli.database.backoffice.entity.UserSecurityRole;
import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;

@Repository
public class UserSecurityRoleDaoImpl extends GenericDaoImpl<UserSecurityRole, Long> implements
		UserSecurityRoleDao {

	public UserSecurityRoleDaoImpl() {
		super(UserSecurityRole.class);
	}
}
