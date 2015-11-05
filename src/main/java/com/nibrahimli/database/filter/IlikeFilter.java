package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class IlikeFilter implements Filter{
	
	String propertyName ;
	Object value ;

	public IlikeFilter(String propertyName, Object value) {
		super();
		this.propertyName = propertyName;
		this.value = value;
	}

	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.ilike(propertyName, value);
	}
	
	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
}