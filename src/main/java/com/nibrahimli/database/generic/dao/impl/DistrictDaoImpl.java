/**
 * 
 */
package com.nibrahimli.database.generic.dao.impl;

import org.springframework.stereotype.Repository;

import com.nibrahimli.database.generic.dao.DistrictDao;
import com.nibrahimli.database.generic.entity.District;

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
