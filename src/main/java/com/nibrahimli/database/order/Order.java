package com.nibrahimli.database.order;


/**
 * @author nibrahimli
 *
 */
public class Order {
	
	private boolean ascending;
	private String propertyName;
	
	protected Order(String propertyName, boolean ascending) {
		this.propertyName = propertyName;
		this.ascending = ascending;
	}

	/**
	 * Ascending order
	 *
	 * @param propertyName The property to order on
	 *
	 * @return The build Order instance
	 */
	public static Order asc(String propertyName) {
		return new Order( propertyName, true );
	}

	/**
	 * Descending order.
	 *
	 * @param propertyName The property to order on
	 *
	 * @return The build Order instance
	 */
	public static Order desc(String propertyName) {
		return new Order( propertyName, false );
	}

	/**
	 * @return
	 */
	public org.hibernate.criterion.Order getHibernateOrder() {
		if(ascending)
			return org.hibernate.criterion.Order.asc(propertyName) ;
		else
			return org.hibernate.criterion.Order.desc(propertyName) ;
	}
}