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
//		List<District> districtList = districtDao.getAll();
//		
//		for (District district : districtList) {
//			District updatedDistrict = district ;
//			updatedDistrict.setName(updatedDistrict.getName().substring(0, 1).toUpperCase()  + updatedDistrict.getName().substring(1));
//			districtDao.saveOrUpdate(updatedDistrict);
//		}
//		
//		System.out.println("Done");
//		
//	  }
//}
