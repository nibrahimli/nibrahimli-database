package com.nibrahimli.database.blog;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nibrahimli.database.blog.dao.impl.ArticleDaoImpl;
import com.nibrahimli.database.blog.entity.Article;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//locations={"/spring/nibrahimli-database-pool-jdbc-context.xml"})
public class ArticleDaoTest {
	
	private final static Logger logger = LoggerFactory.getLogger(ArticleDaoTest.class);
	
	@Mock
	private SessionFactory sessionFactory; 
	@Mock
	private Session session;
	@Mock
	private Criteria criteria ;	
	@Mock
	Article article ;
 
	@Before 
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	 
	public void mockArticle(){
		when(article.getId()).thenReturn(31L);
		when(article.getDate()).thenReturn(new Date());
		when(article.getTitle()).thenReturn("test text");
		when(article.getKeywords()).thenReturn("test keyword");
		when(article.getText()).thenReturn("test text");
	}
	
	@Test
	public void testGetAll(){
		@SuppressWarnings("unchecked")
		List<Article> listArticle = (List<Article>) mock(List.class);
		mockArticle();
		listArticle.add(article);
		
		ArticleDaoImpl articleDao = new ArticleDaoImpl();
		articleDao.setSessionFactory(sessionFactory);
		
		when(sessionFactory.getCurrentSession()).thenReturn(session);
		when(session.createCriteria(Article.class)).thenReturn(criteria);
		when(criteria.list()).thenReturn(listArticle);
		
		List<Article> articleExcepcted = articleDao.getAll();
		
		logger.info("Testing getByAll()");
		
		assertEquals(articleExcepcted, listArticle);
	}
	
	@Test
	public void testGetById(){
		mockArticle();
		ArticleDaoImpl articleDao = new ArticleDaoImpl();
		articleDao.setSessionFactory(sessionFactory);
		
		when(sessionFactory.getCurrentSession()).thenReturn(session);
		when(session.get(Article.class, 31L)).thenReturn(article);
		
		Article expectedArticle = articleDao.getById(31L);
		
		logger.info("testing getById()");
		
		assertEquals(article, expectedArticle);
	}
	
	
	@Test
	public void testCreate(){
		mockArticle();
		ArticleDaoImpl articleDao = new ArticleDaoImpl();
		articleDao.setSessionFactory(sessionFactory);
		when(sessionFactory.getCurrentSession()).thenReturn(session);
		when(session.save(article)).thenReturn(31L);
		
		Long id = articleDao.create(article);
		
		logger.info("Testing create()");
		
		assertEquals(id, article.getId());
	}
	
	@Test
	public void testDelete(){
		mockArticle();
		ArticleDaoImpl articleDao = new ArticleDaoImpl();
		articleDao.setSessionFactory(sessionFactory);
		when(sessionFactory.getCurrentSession()).thenReturn(session);
		doNothing().when(session).delete(article);
		articleDao.delete(article);
		
		logger.info("testing delete() *not completed");
	}
	
	@Test
	public void testUpdate(){
		mockArticle();
		ArticleDaoImpl articleDao = new ArticleDaoImpl();
		articleDao.setSessionFactory(sessionFactory);
		when(sessionFactory.getCurrentSession()).thenReturn(session);
		doNothing().when(session).update(article);
		articleDao.update(article);
		
		logger.info("testing update() *not completed");
	}
	
	@Test
	public void testSaveOrUpdate(){
		mockArticle();
		ArticleDaoImpl articleDao = new ArticleDaoImpl();
		articleDao.setSessionFactory(sessionFactory);
		when(sessionFactory.getCurrentSession()).thenReturn(session);
		doNothing().when(session).saveOrUpdate(article);
		articleDao.saveOrUpdate(article);
		
		logger.info("testing saveOrUpdate() *not completed");
	}

}
