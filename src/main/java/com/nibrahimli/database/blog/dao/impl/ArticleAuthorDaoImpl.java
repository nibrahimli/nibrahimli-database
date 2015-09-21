package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.ArticleAuthorDao;
import com.nibrahimli.database.blog.entity.ArticleAuthor;
import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;

@Repository
public class ArticleAuthorDaoImpl extends GenericDaoImpl<ArticleAuthor, Long> implements ArticleAuthorDao{

	public ArticleAuthorDaoImpl() {
		super(ArticleAuthor.class);
	}
	
}
