package com.cms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cms.domain.Enterprise_Introduction;
import com.cms.service.AboutService;


@Controller
public class AboutController {
	@Resource(name=AboutService.SERVER_NAME)
	private AboutService aboutService = null;
	//用户注册：配置请求的路径
		@RequestMapping(value="/AboutController.action")
		public String AddAbout(@RequestParam("content") String content,HttpServletRequest request){
			Enterprise_Introduction enterprise_Introduction = new Enterprise_Introduction(content);
			aboutService.AddAbout(enterprise_Introduction);
			request.setAttribute("enterprise_Introduction", enterprise_Introduction);
			return "/main.jsp";
		}
		
		
}
