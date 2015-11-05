package com.nibrahimli.database.order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nibrahimli
 *
 */
public class EntityOrder {
	final List<Order> orders = new ArrayList<Order>();
	
	public static EntityOrder builder()
	{
		return new EntityOrder() ;
	}
	
	public EntityOrder add(Order order)
	{
		orders.add(order) ;
		return this ;
	}
	
	public static EntityOrder asc(String... propertyNames)
	{
		EntityOrder entityOrder = builder() ;
		for(String propertyName : propertyNames)
			entityOrder.add(Order.asc(propertyName)) ;		
		return entityOrder ;
	}
	
	public static EntityOrder desc(String... propertyNames)
	{
		EntityOrder entityOrder = builder() ;
		for(String propertyName : propertyNames)
			entityOrder.add(Order.desc(propertyName)) ;		
		return entityOrder ;
	}

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}	
}