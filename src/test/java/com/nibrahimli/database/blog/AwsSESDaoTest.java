package com.nibrahimli.database.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nibrahimli.database.aws.dao.AwsSESDao;
import com.nibrahimli.database.aws.entity.AwsSES;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
locations={"/spring/nibrahimli-database-basic-jdbc-qrupEmlak-context.xml"})
public class AwsSESDaoTest {
	
	private final static Logger logger = LoggerFactory.getLogger(AwsSESDaoTest.class);
	
	
	@Autowired
	AwsSESDao awsSESDao ;
	
	
	@Test
	public void test() throws Exception {
		AwsSES sesCredentials = new AwsSES() ;
		
		sesCredentials.setSmtpUsername("11111");
		sesCredentials.setSmtpPassword("11111");
		
		
		awsSESDao.create(sesCredentials);
	}

}
