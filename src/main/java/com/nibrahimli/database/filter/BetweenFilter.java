package com.nibrahimli.database.filter;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class BetweenFilter implements Filter{
	String propertyName ;
	Object lo ;
	Object hi ;
	
	
	public BetweenFilter(String propertyName, Object lo, Object hi) {
		this.propertyName = propertyName;
		this.lo = lo;
		this.hi = hi;
	}

	@Override
	public Criterion getHibernateCriteria() {
		return Restrictions.between(propertyName, lo, hi) ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BetweenFilter ["
				+ (propertyName != null ? "propertyName=" + propertyName + ", "
						: "") + (lo != null ? "lo=" + lo + ", " : "")
				+ (hi != null ? "hi=" + hi : "") + "]";
	}

	@Override
	public String getPropertyName() {
		return this.propertyName;
	}
	
	
}
