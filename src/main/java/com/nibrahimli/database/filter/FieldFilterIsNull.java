package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FieldFilterIsNull implements Filter{
	
	String propertyName ;
	
	public FieldFilterIsNull(String propertyName) {
		super();
		this.propertyName = propertyName;
	}
	
	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.isNull(propertyName);
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FieldFilter ["
				+ (propertyName != null ? "propertyName=" + propertyName : "") + "]";
	}
	
	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
}