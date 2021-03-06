package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FieldFilterNot implements Filter{
	
	String propertyName ;
	Object value ;
	
	

	public FieldFilterNot(String propertyName, Object value) {
		super();
		this.propertyName = propertyName;
		this.value = value;
	}
	
	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.not(Restrictions.eq(propertyName, value));
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FieldFilter ["
				+ (propertyName != null ? "propertyName=" + propertyName + ", "
						: "") + (value != null ? "value=" + value : "") + "]";
	}
	
	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
}