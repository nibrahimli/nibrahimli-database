//package com.nibrahimli.database.blog;
//
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.nibrahimli.database.generic.dao.CityDao;
//import com.nibrahimli.database.generic.dao.CountryDao;
//import com.nibrahimli.database.generic.dao.DistrictDao;
//import com.nibrahimli.database.generic.entity.District;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//locations={"/spring/nibrahimli-database-basic-jdbc-qrupEmlak-context.xml"})
//public class UpdateDistrictTable {
//	
//	private final static Logger logger = LoggerFactory.getLogger(UpdateDistrictTable.class);
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
//	
//	
//	@Test
//	public void test() {
//		
//
////		List<District> districtList = districtDao.getAll();
////		
////		for (District district : districtList) {
////			District updatedDistrict = district ;
////			updatedDistrict.setName(updatedDistrict.getName().substring(0, 1).toUpperCase()  + updatedDistrict.getName().substring(1));
////			districtDao.saveOrUpdate(updatedDistrict);
////		}
//		
//
//		System.out.println("Done");
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		try {
////
////			String cities = IOUtils.toString(this.getClass().getResourceAsStream("/code_city.csv"), "UTF-8");
////			String[] city = cities.split("\n");
////			Set<City> cityList = new HashSet<City>();
////			for (int i = 1; i < city.length; i++) {
////				String postalCode = city[i].split(",")[0];
////				String cityName = city[i].split(",")[1];
////				City dbCity = new City();
////				dbCity.setPostalCode(Integer.parseInt(postalCode));
////				dbCity.setName(cityName);
////				cityDao.create(dbCity);
////				cityList.add(dbCity);
////			}
////			
////			Country country = new Country();
////			country.setName("Turkey");
////			country.setCode(90);
////			country.setCities(cityList);
////			countryDao.create(country);
////		
////		} catch (Exception e) {
////			logger.error("Error occured {}", e);
////		}
//		
//	  }
//}
