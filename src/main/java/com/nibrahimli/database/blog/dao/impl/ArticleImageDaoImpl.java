package com.nibrahimli.database.blog.dao.impl;

import com.nibrahimli.database.blog.dao.ArticleImageDao;
import com.nibrahimli.database.blog.entity.ArticleImage;
import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;

public class ArticleImageDaoImpl extends GenericDaoImpl<ArticleImage, Long> implements ArticleImageDao{

	public ArticleImageDaoImpl() {
		super(ArticleImage.class);
	}

}
