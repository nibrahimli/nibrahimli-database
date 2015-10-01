//package com.nibrahimli.database.blog;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.nibrahimli.database.image.dao.ImageDao;
//import com.nibrahimli.database.image.entity.Image;
//import com.nibrahimli.database.qrupEmlak.dao.AddressDao;
//import com.nibrahimli.database.qrupEmlak.dao.AnnouncementDao;
//import com.nibrahimli.database.qrupEmlak.dao.CityDao;
//import com.nibrahimli.database.qrupEmlak.dao.CountryDao;
//import com.nibrahimli.database.qrupEmlak.dao.DistrictDao;
//import com.nibrahimli.database.qrupEmlak.entity.Address;
//import com.nibrahimli.database.qrupEmlak.entity.Announcement;
//import com.nibrahimli.database.qrupEmlak.entity.Announcement.Currency;
//import com.nibrahimli.database.qrupEmlak.entity.Announcement.HomeType;
//import com.nibrahimli.database.qrupEmlak.entity.City;
//import com.nibrahimli.database.qrupEmlak.entity.Country;
//import com.nibrahimli.database.qrupEmlak.entity.District;
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
////		Announcement ann = announcementDao.getById(new Long(1));
////		
////		
////		Set<Image> images = ann.getImages();
////		
////		System.out.println(images);
////		
////		List<Image> all = imageDao.getAll();
////		
////		System.out.println(all);
////		
////		
////		List<Country> country = countryDao.getAll();
////		
////		for (Country country2 : country) {
////			
////			for (City city : country2.getCities()) {
////				System.out.println(city);
////			}
////			
////		}
////		
////		
////		System.out.println(country);
//		
//		Country country = new Country();
//		country.setCode(90);
//		country.setName("Turkiye");
//		country.setOriginalName("Türkiye");
//		countryDao.create(country);
//		
//
//		City city =  new City();
//		city.setName("Mugla");
//		city.setOriginalName("Muğla");
//		city.setPostalCode(34);
//		city.setCountry(country);
//		cityDao.create(city);
//		
//		District district = new District();
//		district.setName("Sahinliq");
//		district.setOriginalName("Şahinlıq");
//		district.setCity(city);
//		districtDao.create(district);
//		
//				
//		
//		
//		Address address = new Address();
//		address.setNumber("12");
//		address.setStreet("Çuköz");
//		address.setCountry(country);
//		address.setCity(city);
//		address.setDistrict(district);
//		addressDao.create(address);
//		
//		
//		
//		
//		Image image1 = new Image();
//		image1.setAlt("test-image5");
//		image1.setPath("test5");
//		
//		Image image2 = new Image();
//		image2.setAlt("test-image5");
//		image2.setPath("test5");
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
//		announcement.setTitle("test-4");
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
