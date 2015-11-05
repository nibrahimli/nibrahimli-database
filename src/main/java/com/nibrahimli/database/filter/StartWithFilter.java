package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class StartWithFilter implements Filter{
	
	String propertyName ;
	String value ;

	public StartWithFilter(String propertyName, String value) {
		super();
		this.propertyName = propertyName;
		this.value = value;
	}

	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.like(propertyName, value, MatchMode.START);
	}
	
	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
}