package com.nibrahimli.database.backoffice.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.backoffice.dao.SecurityRoleDao;
import com.nibrahimli.database.backoffice.entity.SecurityRole;
import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;

@Repository
public class SecurityRoleDaoImpl extends GenericDaoImpl<SecurityRole, Long> implements
		SecurityRoleDao {

	public SecurityRoleDaoImpl() {
		super(SecurityRole.class);
	}
}
