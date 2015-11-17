package com.nibrahimli.database.aws.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.aws.dao.AwsSESDao;
import com.nibrahimli.database.aws.entity.AwsSES;
import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;

@Repository
public class AwsSESDaoImpl extends GenericDaoImpl<AwsSES, Long> implements AwsSESDao{

	public AwsSESDaoImpl() {
		super(AwsSES.class);
	}

}
