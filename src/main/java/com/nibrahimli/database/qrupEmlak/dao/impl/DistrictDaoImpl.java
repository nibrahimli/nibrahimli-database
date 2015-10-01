/**
 * 
 */
package com.nibrahimli.database.qrupEmlak.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.generic.dao.impl.GenericDaoImpl;
import com.nibrahimli.database.qrupEmlak.dao.DistrictDao;
import com.nibrahimli.database.qrupEmlak.entity.District;

/**
 * @author nibrahim
 *
 */

@Repository
public class DistrictDaoImpl extends GenericDaoImpl<District, Long> implements DistrictDao {

	public DistrictDaoImpl() {
		super(District.class);
	}


}
