/**
 * 
 */
package com.nibrahimli.database.qrupEmlak.dao;

import java.util.List;

import com.nibrahimli.database.generic.dao.GenericDao;
import com.nibrahimli.database.qrupEmlak.entity.Announcement;

/**
 * @author nibrahim
 *
 */
public interface AnnouncementDao extends GenericDao<Announcement, Long> {
	
	public void deleteImage(Long imageId);
	public List<Announcement> getFeaturedAnnouncements();
	public List<Announcement> getNonFeaturedAnnouncements();
	
}
