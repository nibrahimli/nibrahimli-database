package com.nibrahimli.database.generic.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nibrahimli.database.generic.dao.GenericDao;


public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK>{

	@Autowired
	private SessionFactory sessionFactory;
	
	Class<T> type;
	public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<T> getAll() {
		return getSession().createCriteria(type).list();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<T> getAllDistinctOrderByDate() {
		List<T> result = getSession().createCriteria(type)
				.addOrder(Order.desc("date"))
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)  
                .list(); 
		return result;
	}

	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public T getById(PK id) {
		return (T) getSession().get(type, id);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public PK create(T newInstance) {
		return (PK) getSession().save(newInstance);
	}

	@Transactional
	public void update(T transiebtObject) {
		getSession().update(transiebtObject);
	}

	@Transactional
	public void delete(T persistentObject) {
		getSession().delete(persistentObject);	
	}

	@Transactional
	public void saveOrUpdate(T transientObject) {
		getSession().saveOrUpdate(transientObject);
	}
	
	/**
	 * @return the sessionFactory
	 */
	@Transactional
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	@Transactional
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
