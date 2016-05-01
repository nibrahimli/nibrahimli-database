package com.nibrahimli.database.qrupEmlak.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.qrupEmlak.dao.QrupEmlakSitemapDao;
import com.nibrahimli.database.qrupEmlak.entity.QrupEmlakSitemap;

@Repository
public class QrupEmlakSitemapDaoImpl extends GenericDaoImpl<QrupEmlakSitemap, Long> implements QrupEmlakSitemapDao{

	public QrupEmlakSitemapDaoImpl() {
		super(QrupEmlakSitemap.class);
	}

	@Transactional
	public void deleteAll() {
		getSession().createSQLQuery("delete from qrup_emlak_sitemap").executeUpdate();
	}
}
