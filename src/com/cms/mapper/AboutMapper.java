package com.cms.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import com.cms.domain.Enterprise_Introduction;

public interface AboutMapper {
	@Insert("insert into Enterprise_Introduction(content) values(#{content})")
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="content",column="content"),		
	})
	public void AddAbout(Enterprise_Introduction enterprise_Introduction);
}
