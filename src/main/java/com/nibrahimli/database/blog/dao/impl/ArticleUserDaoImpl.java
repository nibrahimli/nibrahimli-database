package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.ArticleUserDao;
import com.nibrahimli.database.blog.entity.ArticleUser;

@Repository
public class ArticleUserDaoImpl extends GenericDaoImpl<ArticleUser, Long> implements ArticleUserDao{

	public ArticleUserDaoImpl() {
		super(ArticleUser.class);
	}
	
}
