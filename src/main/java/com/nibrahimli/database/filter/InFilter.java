package com.nibrahimli.database.filter;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class InFilter implements Filter{
	
	String propertyName ;
	Collection<Object> values ;

	public InFilter(String propertyName, Collection<Object> values) {
		this.propertyName = propertyName ;
		this.values = values ;
	}
	
	public InFilter(String propertyName, Object[] values) {
		this(propertyName, Arrays.asList(values)) ;
	}

	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.in(propertyName, values);
	}
	
	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
}