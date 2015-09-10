package com.nibrahimli.database.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.generic.dao.AddressDao;
import com.nibrahimli.database.generic.entity.Address;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address, Long> implements AddressDao {

	public AddressDaoImpl() {
		super(Address.class);
	}

}
