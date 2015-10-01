//package com.nibrahimli.database.blog;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
//locations={"/spring/nibrahimli-database-basic-jdbc-backoffice-context.xml"})
//public class BackofficeDatabaseConnectionTest {
//
//	private static final Logger logger = LoggerFactory.getLogger(BackofficeDatabaseConnectionTest.class);
//	
//	
//	@Autowired
//	private UserDao userDao;
//	@Autowired
//	private SecurityRoleDao securityRoleDao ;
//	
//	@Test
//	public void test(){
//		
//		SecurityRole securityRole = new SecurityRole();
//		securityRole.setRoleName("ROLE_ADMIN");
//		
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String hashedPassword = passwordEncoder.encode("123456");
//		
//		User user = new User();
//		user.setUsername("test");
//		user.setPassword(hashedPassword);
//		user.setEnabled(true);
//		Set<SecurityRole> securityRoleList1 = new HashSet<SecurityRole>();
//		securityRoleList1.add(securityRole);
//		
//		user.setSecurityRoleList(securityRoleList1);
//		
//		logger.info("error is coming just after that");
//		securityRoleDao.create(securityRole);
//		userDao.create(user);
//		
//		
//		List<User> userList = userDao.getAll();
//		logger.info("userList {}", userList);
//		List<SecurityRole> securityRoleList = securityRoleDao.getAll();
//		logger.info("securityRoleList {}", securityRoleList);
//	}
//}
