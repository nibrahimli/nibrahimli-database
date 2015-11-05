package com.nibrahimli.database.hibernate;

import org.hibernate.transform.ResultTransformer;

public class NestedTransformers{
	
	private NestedTransformers(){}
	
	public static ResultTransformer aliasToNestedBean(Class<?> target) {
		return new AliasToBeanNestedResultTransformer(target);
	}
}