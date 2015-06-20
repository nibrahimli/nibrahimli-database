package com.nibrahimli.database.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.ImageDao;
import com.nibrahimli.database.blog.entity.Image;

@Repository
public class ImageDaoImpl extends GenericDaoImpl<Image, Long> implements ImageDao{

	public ImageDaoImpl() {
		super(Image.class);
	}
}
