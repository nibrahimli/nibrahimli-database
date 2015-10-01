package com.nibrahimli.database.generic.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {

	PK create(T newInstance);
	List<T> getAll();
	List<T> getAllDistinctOrderByDate();
	T getById(PK id);
	void update(T transiebtObject);
	void delete(T persistentObject);
	void saveOrUpdate(T transientObject);
	
}
