package com.nibrahimli.database.blog;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nibrahimli.database.blog.dao.ArticleDao;
import com.nibrahimli.database.blog.dao.CategoryDao;
import com.nibrahimli.database.blog.dao.UserDao;
import com.nibrahimli.database.blog.entity.Article;
import com.nibrahimli.database.blog.entity.Category;
import com.nibrahimli.database.blog.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
locations={"/spring/nibrahimli-database-pool-jdbc-context.xml"})
public class TestDatabaseConnection {
	
	private final static Logger logger = LoggerFactory.getLogger(TestDatabaseConnection.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ArticleDao articleDao ;
	
	@Test
	public void test(){
		
//		User user = new User();
//		user.setPseudo("nibrahimli");
//		user.setFirstName("Nihat");
//		user.setLastName("IBRAHIMLI");
//		user.setPassword("1111");
//		user.setConfirmPassword("1111");
//		user.setEmail("nihatibrahimli@gmail.com");
//		user.setConfirmEmail("nihatibrahimli@gmail.com");
		
//		userDao.create(user);
		
//		Category category = new Category();
//		category.setName("Web");
		
//		categoryDao.create(category);
		
//		Article article = new Article();
//		article.setTitle("Web Spring");
//		article.setText("Good framwork");
//		article.setKeywords("spring java ee");
//		article.setDate(new Date());
//		Set<Category> ctgList = new HashSet<Category>();
//		ctgList.add(categoryDao.getById(1L));
//		article.setCategoryList(ctgList);
//		Set<User> authorList = new HashSet<User>();
//		authorList.add(userDao.getById(1L));
//		article.setAuthorList(authorList);
//		
//		articleDao.create(article);
		
		

		
		List<User> userList = userDao.getAll();
		logger.info("user list {}", userList);
		List<Category> categoryList = categoryDao.getAll();
		logger.info("category list {}", categoryList);
		List<Article> articleList = articleDao.getAll();
		logger.info("article list {}", articleList);
	}
	
	
}
