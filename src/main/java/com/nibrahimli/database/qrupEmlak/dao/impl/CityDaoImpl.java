package com.nibrahimli.database.qrupEmlak.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.qrupEmlak.dao.CityDao;
import com.nibrahimli.database.qrupEmlak.entity.City;

@Repository
public class CityDaoImpl extends GenericDaoImpl<City, Long> implements CityDao {

	public CityDaoImpl() {
		super(City.class);
	}

}
