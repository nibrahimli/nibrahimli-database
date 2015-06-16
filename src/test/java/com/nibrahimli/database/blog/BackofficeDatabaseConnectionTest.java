//package com.nibrahimli.database.blog;
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
//import com.nibrahimli.database.backoffice.dao.SecurityRoleDao;
//import com.nibrahimli.database.backoffice.dao.UserDao;
//import com.nibrahimli.database.backoffice.entity.SecurityRole;
//import com.nibrahimli.database.backoffice.entity.User;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//locations={"/spring/nibrahimli-database-pool-jdbc-backoffice-context.xml"})
//public class BackofficeDatabaseConnectionTest {
//
//	private static final Logger logger = LoggerFactory.getLogger(BackofficeDatabaseConnectionTest.class);
//	
//	
//	@Autowired
//	private UserDao userDao;
//	private SecurityRoleDao securityRoleDao ;
//	
//	@Test
//	public void test(){
//		List<User> userList = userDao.getAll();
//		logger.info("userList {}", userList);
//		List<SecurityRole> securityRoleList = securityRoleDao.getAll();
//		logger.info("securityRoleList {}", securityRoleList);
//	}
//}
