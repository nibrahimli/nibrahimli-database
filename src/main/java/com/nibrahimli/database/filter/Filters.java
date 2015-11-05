package com.nibrahimli.database.filter;

import java.util.Collection;

public class Filters {
	
	public static Filter between(String propertyName, Object lo, Object hi)
	{
		return new BetweenFilter(propertyName, lo, hi) ;
	}
	public static Filter eq(String propertyName, Object value)
	{
		return new FieldFilter(propertyName, value) ;
	}
	public static Filter notEq(String propertyName, Object value)
	{
		return new FieldFilterNot(propertyName, value) ;
	}
	public static Filter isNotNull(String propertyName)
	{
		return new FieldFilterIsNotNull(propertyName) ;
	}
	public static Filter isNull(String propertyName)
	{
		return new FieldFilterIsNull(propertyName) ;
	}
	public static Filter in(String propertyName, Collection<Object> values)
	{
		return new InFilter(propertyName, values) ;
	}
	
	public static Filter in(String propertyName, Object... values)
	{
		return new InFilter(propertyName, values) ;
	}
	public static Filter like(String propertyName, Object value)
	{
		return new LikeFilter(propertyName, value) ;
	}
	
	public static Filter ilike(String propertyName, Object value)
	{
		return new IlikeFilter(propertyName, value) ;
	}
	
	public static Filter startWith(String propertyName, String value)
	{
		return new StartWithFilter(propertyName, value) ;
	}
}
