//package com.nibrahimli.database.blog;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
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
//import com.nibrahimli.database.blog.dao.ArticleDao;
//import com.nibrahimli.database.blog.dao.AuthorDao;
//import com.nibrahimli.database.blog.entity.Article;
//import com.nibrahimli.database.blog.entity.Author;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//locations={"/spring/nibrahimli-database-pool-jdbc-context.xml"})
//public class TestDatabaseConnection {
//	
//	private final static Logger logger = LoggerFactory.getLogger(TestDatabaseConnection.class);
//	
//	static private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
//	
//	@Autowired
//	private AuthorDao authorDao;
//	
//	@Autowired
//	private ArticleDao articleDao ;
//	
//	@Test
//	public void test() throws Exception{
//		
//		Author author = new Author();
//		author.setPseudo("nibrahimli");
//		author.setFirstName("Nihat");
//		author.setLastName("IBRAHIMLI");
//		author.setPassword("1111");
//		author.setConfirmPassword("1111");
//		author.setEmail("nihatibrahimli@gmail.com");
//		author.setConfirmEmail("nihatibrahimli@gmail.com");
//		
//		
//		Author author1 = new Author();
//		author1.setPseudo("sbay");
//		author1.setFirstName("Sinan");
//		author1.setLastName("Baymammadli");
//		author1.setPassword("1111");
//		author1.setConfirmPassword("1111");
//		author1.setEmail("sinan@gmail.com");
//		author1.setConfirmEmail("sinan@gmail.com");
//		
//		
//		authorDao.create(author);
//		authorDao.create(author1);
//		
//		
//	public void test(){
//		
//		User user = new User();
//		user.setPseudo("nibrahimli");
//		user.setFirstName("Nihat");
//		user.setLastName("IBRAHIMLI");
//		user.setPassword("1111");
//		user.setConfirmPassword("1111");
//		user.setEmail("nihatibrahimli@gmail.com");
//		user.setConfirmEmail("nihatibrahimli@gmail.com");
//		
//		authorDao.create(user);
//		
//		Category category = new Category();
//		category.setName("Web");
//		
//		categoryDao.create(category);
//		
//		Article article = new Article();
//		article.setTitle("Web Spring");
//		article.setText("Good framwork");
//		article.setKeywords("spring java ee");
//		article.setDate(sdf.parse(sdf.format(new Date())));
//		Set<Author> authorList = new HashSet<Author>();
//		authorList.add(author);
//		authorList.add(author1);
//		article.setAuthorList(authorList);
//		
//		articleDao.create(article);
//		
//		
//
//		
//		List<Author> userList = authorDao.getAll();
//		logger.info("author list {}", userList);
//		List<Article> articleList = articleDao.getAll();
//		logger.info("article list {}", articleList);
//	}
//	
//	
//}
