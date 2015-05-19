package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.ArticleDao;
import com.nibrahimli.database.blog.entity.Article;

@Repository
public class ArticleDaoImpl extends GenericDaoImpl<Article, Long> implements ArticleDao{

	public ArticleDaoImpl() {
		super(Article.class);
	}

}
