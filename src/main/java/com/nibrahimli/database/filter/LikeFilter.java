package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LikeFilter implements Filter{
	
	String propertyName ;
	Object value ;

	public LikeFilter(String propertyName, Object value) {
		super();
		this.propertyName = propertyName;
		this.value = value;
	}

	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.like(propertyName, value);
	}
	
	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
}