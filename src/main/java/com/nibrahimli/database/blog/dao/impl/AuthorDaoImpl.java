package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.AuthorDao;
import com.nibrahimli.database.blog.entity.Author;

@Repository
public class AuthorDaoImpl extends GenericDaoImpl<Author, Long> implements AuthorDao{

	public AuthorDaoImpl() {
		super(Author.class);
	}
	
}
