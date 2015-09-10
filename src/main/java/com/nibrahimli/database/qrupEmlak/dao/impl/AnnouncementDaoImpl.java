/**
 * 
 */
package com.nibrahimli.database.qrupEmlak.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;
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

}
