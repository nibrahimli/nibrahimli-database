package com.nibrahimli.database.generic.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nibrahimli.database.filter.EntityFilter;
import com.nibrahimli.database.filter.Filter;
import com.nibrahimli.database.generic.dao.GenericDao;
import com.nibrahimli.database.order.EntityOrder;
import com.nibrahimli.database.order.Order;


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
	public List<T> getAll(String... fields) {
		Criteria crit = getSession().createCriteria(type) ;
		crit = addProjection(crit, fields) ;
		return crit.list();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<T> getAllDistinctOrderByDate() {
		Criteria crt = getSession().createCriteria(type);
		List<T> result = crt.addOrder(org.hibernate.criterion.Order.desc("date"))
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
	
	@Transactional(readOnly = true)
	public List<T> getAll(EntityFilter entityFilter, String... fields) {
		return (List<T>) getAll(entityFilter, 0, fields);
	}
	
	@Transactional(readOnly = true)
	public List<T> getAll(EntityFilter entityFilter, EntityOrder entityOrder, String... fields) {
		return (List<T>) getAll(entityFilter, entityOrder, 0, fields);
	}
	
	@Transactional(readOnly = true)
	public List<T> getAll(EntityFilter entityFilter, int limit, String... fields) {
		return getAll(entityFilter, null, limit, fields) ;
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<T> getAll(EntityFilter entityFilter, EntityOrder entityOrder, int limit, String... fields) {
		Criteria crit = createCriteria() ;
		crit = addFilters(crit, entityFilter) ;
		crit = addOrder(crit, entityOrder) ;
		if(limit > 0)
		{
			crit.setMaxResults(limit) ;
		}
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		crit = addProjection(crit, fields) ;
		
		
		return (List<T>) crit.list();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public T get(EntityFilter entityFilter, String... fields) {
		Criteria crit = createCriteria() ;
		crit = addFilters(crit, entityFilter) ;
		crit = addProjection(crit, fields) ;
		return (T) crit.uniqueResult();
	}
	
	@Transactional(readOnly = true)
	public Long count(EntityFilter entityFilter) {
		Criteria crit = createCriteria() ;
		crit = addFilters(crit, entityFilter) ;
		return (Long) crit.setProjection(Projections.rowCount()).uniqueResult();
	}
	
	
	protected Criteria createCriteria()
	{
		return getSession().createCriteria(type) ;
	}
	
	protected Criteria addFilters(Criteria crit, EntityFilter entityFilter) {
		if(entityFilter != null)
		{
			for(Filter filter:entityFilter.getFilters())
			{
				crit = getAliases(crit, filter.getPropertyName()) ;
				crit.add(filter.getHibernateCriteria()) ;				
			}
		}
		return crit;
	}
	
	private Criteria addOrder(Criteria crit, EntityOrder entityOrder) {
		if(entityOrder != null && CollectionUtils.isNotEmpty(entityOrder.getOrders()))
		{
			for(Order order : entityOrder.getOrders())
			{
				crit.addOrder(order.getHibernateOrder()) ;
			}
		}
		
		return crit ;
	}
	
	protected Criteria addProjection(Criteria criteria, String... fields)
	{
		if(fields.length > 0)
		{
			ProjectionList pl = Projections.projectionList() ;
			
			for(String field:fields)
			{
				pl.add(Projections.property(field), field) ;
			}
			criteria.setProjection(pl) ;
			
			criteria = getAliases(criteria, fields) ;				
		}
		
		return criteria ;
	}
	
	protected Criteria getAliases(Criteria criteria, String... fields)
	{
		Map<String, String> aliases = new HashMap<String, String>() ;
		for (String field:fields) {

			//Boolean hasChild = false;
			if (field.contains(".")) {
				String[] sp = field.split("\\.");
				String associationPath = "";
				for (int i = 0; i < sp.length -1; i++) {
					String fieldName = sp[i];
					if(aliases.isEmpty()){
						associationPath+= fieldName; 
						aliases.put(associationPath, fieldName) ;						
					}
					else if(!aliases.containsKey(associationPath)){
						associationPath+="."+fieldName;
						aliases.put(associationPath, fieldName) ;
					}
					else
						continue;
						
				}
				
			}
		}
		if(MapUtils.isNotEmpty(aliases)){
			for(String associationPath : aliases.keySet())
			{
				criteria.createAlias(associationPath, aliases.get(associationPath)) ;
			}				
			
//			if(aliases != null && aliases.size() > 0)
//			{
//				criteria.setResultTransformer(NestedTransformers.aliasToNestedBean(type)) ;
//			}
//			else
//			{
//				criteria.setResultTransformer(Transformers.aliasToBean(type));
//			}	
		}
		return criteria ;
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
