package org.ims.controllers;

import java.util.List;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.ims.beans.Client;
import org.ims.beans.Person;
import org.ims.beans.Product;
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
	public String updateProduct(HttpServletRequest req){
		req.setAttribute("newProduct", new Product());
		return "updateProduct";
	}
	@RequestMapping(value="updateClientList.do", method=RequestMethod.GET)
	public String updateClientList(HttpServletRequest req){
		req.setAttribute("myclient", new Client());
		return "updateClientList";
	}
	@RequestMapping(value="registerProduct.do", method=RequestMethod.POST)
	public String registerProduct(HttpServletRequest req){
		return "index";
	}
	@RequestMapping(value="updateclient.do", method=RequestMethod.POST)
	public String updateClient(HttpServletRequest req){
		return "index";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {}
	@Override
	public void setServletContext(ServletContext ctxt) {
		this.servletContext = ctxt;
		}
}
