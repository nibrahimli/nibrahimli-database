package com.nibrahimli.database.image.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.image.dao.ImageDao;
import com.nibrahimli.database.image.entity.Image;

@Repository
public class ImageDaoImpl extends GenericDaoImpl<Image, Long> implements ImageDao{

	public ImageDaoImpl() {
		super(Image.class);
	}
}
