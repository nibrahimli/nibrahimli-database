package com.nibrahimli.database.generic.dao;

import java.io.Serializable;
import java.util.List;

import com.nibrahimli.database.filter.EntityFilter;
import com.nibrahimli.database.order.EntityOrder;

public interface GenericDao<T, PK extends Serializable> {

	PK create(T newInstance);
	List<T> getAll();
	List<T> getAll(String... fields);
	List<T> getAll(EntityFilter entityFilter, String... fields);
	List<T> getAll(EntityFilter entityFilter, int limit, String... fields);
	List<T> getAll(EntityOrder entityOrder, String... fields) ;
	List<T> getAll(EntityFilter entityFilter, EntityOrder entityOrder, String... fields) ;
	List<T> getAll(EntityFilter entityFilter, EntityOrder entityOrder, int limit, String... fields) ;
	List<T> getAllDistinctOrderByDate();
	T get(EntityFilter entityFilter, String... fields) ;
	
	T getById(PK id);
	void update(T transiebtObject);
	void delete(T persistentObject);
	void saveOrUpdate(T transientObject);
	Long count(EntityFilter entityFilter) ;
	
}
