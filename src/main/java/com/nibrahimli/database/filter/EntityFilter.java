package com.nibrahimli.database.filter;

import java.util.ArrayList;
import java.util.List;

public class EntityFilter {
	
	final List<Filter> filters = new ArrayList<Filter>();
	
	public EntityFilter add(Filter filter)
	{
		filters.add(filter) ;
		return this ;
	}

	/**
	 * @return the filters
	 */
	public List<Filter> getFilters() {
		return filters;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EntityFilter [" + (filters != null ? "filters=" + filters : "")
				+ "]";
	}
	
	public static EntityFilter builder()
	{
		return new EntityFilter() ;
	}
	
}