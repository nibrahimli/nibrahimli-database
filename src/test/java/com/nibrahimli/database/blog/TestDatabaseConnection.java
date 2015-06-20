//package com.nibrahimli.database.blog;
//
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
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
//import com.nibrahimli.database.blog.dao.ImageDao;
//import com.nibrahimli.database.blog.entity.Article;
//import com.nibrahimli.database.blog.entity.Author;
//import com.nibrahimli.database.blog.entity.Image;
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
//	@Autowired
//	private ImageDao imageDao ;
//	
//	@Test
//	public void test() throws Exception{
//		
//		Image avatar1 = new Image() ;
//		avatar1.setPath("nibrahimli.png");
//		
//		Author author = new Author();
//		author.setPseudo("nibrahimli");
//		author.setFirstName("Nihat");
//		author.setLastName("IBRAHIMLI");
//		author.setPassword("1111");
//		author.setConfirmPassword("1111");
//		author.setEmail("nihatibrahimli@gmail.com");
//		author.setConfirmEmail("nihatibrahimli@gmail.com");
//		author.setAvatar(avatar1);
//		
//				
//		
//		Image avatar2 = new Image() ;
//		avatar2.setPath("sbay.png");
//		
//		Author author1 = new Author();
//		author1.setPseudo("sbay");
//		author1.setFirstName("Sinan");
//		author1.setLastName("Baymammadli");
//		author1.setPassword("1111");
//		author1.setConfirmPassword("1111");
//		author1.setEmail("sinan@gmail.com");
//		author1.setConfirmEmail("sinan@gmail.com");
//		author1.setAvatar(avatar2);
//		
//		imageDao.create(avatar1);
//		imageDao.create(avatar2);
//		
//		authorDao.create(author);
//		authorDao.create(author1);
//		
//		
//		Image image = new Image();
//		image.setPath("1.png");
//		image.setAlt("this is big data");
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
//		article.setImages(Arrays.asList(image));
//		
//		imageDao.create(image);
//		articleDao.create(article);
//		
//		
//
//		
//		List<Author> authorList1 = authorDao.getAll();
//		logger.info("author list {}", authorList1);
//		List<Article> articleList = articleDao.getAll();
//		logger.info("article list {}", articleList);
//	}
//	
//	
//}
