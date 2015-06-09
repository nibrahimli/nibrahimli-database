package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.ArticleCategoryDao;
import com.nibrahimli.database.blog.entity.ArticleCategory;

@Repository
public class ArticleCategoryDaoImpl extends GenericDaoImpl<ArticleCategory, Long> implements ArticleCategoryDao{

	public ArticleCategoryDaoImpl() {
		super(ArticleCategory.class);
	}

}
