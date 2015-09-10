package com.nibrahimli.database.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.generic.dao.CountryDao;
import com.nibrahimli.database.generic.entity.Country;

@Repository
public class CountryDaoImpl extends GenericDaoImpl<Country, Long> implements CountryDao {

	public CountryDaoImpl() {
		super(Country.class);
	}

}
