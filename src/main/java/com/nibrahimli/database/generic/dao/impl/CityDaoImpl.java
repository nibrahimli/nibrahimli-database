package com.nibrahimli.database.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.generic.dao.CityDao;
import com.nibrahimli.database.generic.entity.City;

@Repository
public class CityDaoImpl extends GenericDaoImpl<City, Long> implements CityDao {

	public CityDaoImpl() {
		super(City.class);
	}

}
