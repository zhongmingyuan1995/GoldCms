package com.cms.dao.impl;

import org.springframework.stereotype.Repository;

import com.cms.dao.AboutDao;
import com.cms.domain.Enterprise_Introduction;
import com.cms.mapper.AboutMapper;
@Repository(value=AboutDao.SERVER_NAME)
public class AboutDaoImpl implements AboutDao {
	AboutMapper aboutMapper = null;
	@Override
	public void AddAbout(Enterprise_Introduction enterprise_Introduction) {
		aboutMapper.AddAbout(enterprise_Introduction);
	}

}
