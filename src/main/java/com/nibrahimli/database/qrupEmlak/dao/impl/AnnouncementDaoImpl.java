/**
 * 
 */
package com.nibrahimli.database.qrupEmlak.dao.impl;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
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

}
