package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;

public interface Filter {	
	public Criterion getHibernateCriteria() ;	
	public String getPropertyName();
}
