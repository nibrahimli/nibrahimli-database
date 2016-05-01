package com.nibrahimli.database.qrupEmlak.dao;

import com.nibrahimli.database.generic.dao.GenericDao;
import com.nibrahimli.database.qrupEmlak.entity.QrupEmlakSitemap;

public interface QrupEmlakSitemapDao extends GenericDao<QrupEmlakSitemap, Long>{

	void deleteAll();
}
