package com.nibrahimli.database.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.blog.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.generic.dao.ImageDao;
import com.nibrahimli.database.generic.entity.Image;

@Repository
public class ImageDaoImpl extends GenericDaoImpl<Image, Long> implements ImageDao{

	public ImageDaoImpl() {
		super(Image.class);
	}
}
