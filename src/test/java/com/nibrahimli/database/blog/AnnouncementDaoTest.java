//package com.nibrahimli.database.blog;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.hibernate.Hibernate;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.nibrahimli.database.generic.dao.AddressDao;
//import com.nibrahimli.database.generic.dao.CityDao;
//import com.nibrahimli.database.generic.dao.CountryDao;
//import com.nibrahimli.database.generic.dao.DistrictDao;
//import com.nibrahimli.database.generic.dao.ImageDao;
//import com.nibrahimli.database.generic.entity.Address;
//import com.nibrahimli.database.generic.entity.City;
//import com.nibrahimli.database.generic.entity.Country;
//import com.nibrahimli.database.generic.entity.District;
//import com.nibrahimli.database.generic.entity.Image;
//import com.nibrahimli.database.qrupEmlak.dao.AnnouncementDao;
//import com.nibrahimli.database.qrupEmlak.entity.Announcement;
//import com.nibrahimli.database.qrupEmlak.entity.Announcement.Currency;
//import com.nibrahimli.database.qrupEmlak.entity.Announcement.HomeType;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//locations={"/spring/nibrahimli-database-basic-jdbc-qrupEmlak-context.xml"})
//public class AnnouncementDaoTest {
//	
//	private final static Logger logger = LoggerFactory.getLogger(AnnouncementDaoTest.class);
//	
//	
//	@Autowired
//	private AnnouncementDao announcementDao;
//		
//	@Autowired
//	private ImageDao imageDao ;
//	
//	@Autowired
//	private CityDao cityDao ;
//	
//	@Autowired
//	private CountryDao countryDao ;
//
//	@Autowired
//	private DistrictDao districtDao ;
//	
//	@Autowired
//	private AddressDao addressDao ;
//	
//
//	@Test
//	public void test(){
//		logger.info("Announcement object");
//		
//		
////		Country country = countryDao.getById(new Long(1));
////		City city =  cityDao.getById(new Long(1));
//		District district = districtDao.getById(new Long(1));
////		Hibernate.initialize(district.getCity());
//		City city = district.getCity();
////		Hibernate.initialize(city.getCountry());
//		Country country = city.getCountry();
//		
//		Address address = new Address();
//		address.setNumber(12);
//		address.setStreet("Eminonu");
//		address.setCountry(country);
//		address.setCity(city);
//		address.setDistrict(district);
//		addressDao.create(address);
//		
//		
//		
//		
//		Image image1 = new Image();
//		image1.setAlt("test-image");
//		image1.setPath("test");
//		
//		Image image2 = new Image();
//		image2.setAlt("test-image");
//		image2.setPath("test");
//		
//		imageDao.create(image1);
//		imageDao.create(image2);
//		
//		
//		Set<Image> images = new HashSet<Image>();
//		images.add(image1);
//		images.add(image2);
//		
//		Announcement announcement = new Announcement();
//		announcement.setTitle("test-1");
//		announcement.setRoomNumber(1);
//		announcement.setPrice(100);
//		announcement.setLift(true);
//		announcement.setHomeType(HomeType.Flat);
//		announcement.setFloor(3);
//		announcement.setDescription("test");
//		announcement.setDate(new Date());
//		announcement.setCurrency(Currency.Manat);
//		announcement.setImages(images);
//		announcement.setAddress(address);
//		announcementDao.create(announcement);
//		
//		
//		
//	}
//}
