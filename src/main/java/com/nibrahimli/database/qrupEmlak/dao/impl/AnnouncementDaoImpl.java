/**
 * 
 */
package com.nibrahimli.database.qrupEmlak.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nibrahimli.database.filter.EntityFilter;
import com.nibrahimli.database.filter.Filters;
import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.order.EntityOrder;
import com.nibrahimli.database.order.Order;
import com.nibrahimli.database.qrupEmlak.dao.AnnouncementDao;
import com.nibrahimli.database.qrupEmlak.entity.Announcement;

/**
 * @author nibrahim
 *
 */
@Repository
public class AnnouncementDaoImpl extends GenericDaoImpl<Announcement, Long> implements
		AnnouncementDao {

	public AnnouncementDaoImpl() {
		super(Announcement.class);
	}

	@Transactional
	public void deleteImage(Long imageId) {
		Query query = getSession().createSQLQuery("delete from announcement_image where image_id= :image_id")
				.setParameter("image_id", imageId);	
		query.executeUpdate();
	}
	
	@Cacheable("featuredAnnouncements")
	@Transactional(readOnly=true)
	public List<Announcement> getFeaturedAnnouncements(){
		EntityFilter entityFilter = EntityFilter.builder();
		EntityOrder entityOrder = EntityOrder.builder();
		List<Announcement> announcementList = super.getAll(entityFilter.add(Filters.eq("popular", true)), entityOrder.add(Order.desc("viewsNumber")));
		return announcementList;
	}
	
	@Cacheable("nonFeaturedAnnouncements")
	@Transactional(readOnly=true)
	public List<Announcement> getNonFeaturedAnnouncements(){
		EntityFilter entityFilter = EntityFilter.builder();
		EntityOrder entityOrder = EntityOrder.builder();
		List<Announcement> announcementList = super.getAll(entityFilter.add(Filters.eq("popular", false)), entityOrder.add(Order.desc("viewsNumber")));
		return announcementList;
	}

}
