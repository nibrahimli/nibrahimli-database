package com.nibrahimli.database.qrupEmlak.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.qrupEmlak.dao.AddressDao;
import com.nibrahimli.database.qrupEmlak.entity.Address;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address, Long> implements AddressDao {

	public AddressDaoImpl() {
		super(Address.class);
	}

}
