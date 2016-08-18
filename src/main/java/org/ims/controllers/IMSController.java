package org.ims.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;

@Controller
public class IMSController implements ServletContextAware,
																			InitializingBean{

	@Autowired
	private ServletContext servletContext; //instance var

	@RequestMapping(value="updateProduct.do", method=RequestMethod.GET)
	public String hello(HttpServletRequest req){
		return "updateProduct";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}
	@Override
	public void setServletContext(ServletContext ctxt) {
		this.servletContext = ctxt;
		}
}
