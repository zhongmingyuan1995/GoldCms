package com.cms.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cms.dao.AboutDao;
import com.cms.domain.Enterprise_Introduction;
import com.cms.service.AboutService;
@Service(value=AboutService.SERVER_NAME)
public class AboutServiceImpl implements AboutService {
	@Resource(name=AboutDao.SERVER_NAME)
    private AboutDao aboutDao = null;
	@Override
	public void AddAbout(Enterprise_Introduction enterprise_Introduction) {
		aboutDao.AddAbout(enterprise_Introduction);

	}

}
