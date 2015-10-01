package com.nibrahimli.database.qrupEmlak.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.qrupEmlak.dao.CountryDao;
import com.nibrahimli.database.qrupEmlak.entity.Country;

@Repository
public class CountryDaoImpl extends GenericDaoImpl<Country, Long> implements CountryDao {

	public CountryDaoImpl() {
		super(Country.class);
	}

}
