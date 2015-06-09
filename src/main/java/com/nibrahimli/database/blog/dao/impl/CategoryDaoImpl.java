package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.CategoryDao;
import com.nibrahimli.database.blog.entity.Category;

@Repository
public class CategoryDaoImpl extends GenericDaoImpl<Category, Long> implements CategoryDao{

	public CategoryDaoImpl() {
		super(Category.class);
	}

}
