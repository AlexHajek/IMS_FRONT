package org.ims.controllers;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.hibernate.Session;
import org.ims.IMS_WEB.IMSDAO;
import org.ims.IMS_WEB.SessionFactoryManager;
import org.ims.beans.Client;
import org.ims.beans.Product;
import org.ims.beans.StateAbbrvBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IMSController implements ServletContextAware,
																			InitializingBean{	
	@Autowired
	private ServletContext servletContext; //instance var

	@RequestMapping(value="updateProduct.do", method=RequestMethod.GET)
	public String updateProduct(HttpServletRequest req){
		req.setAttribute("newProduct", new Product());
//		Session session = SessionFactoryManager.getInstance().openSession();
//		session.close();
//		IMSDAO dao =new IMSDAO(SessionFactoryManager.getInstance().openSession());
//		List<StateAbbrvBean> list = dao.getAllStatesAbb();
//		for(StateAbbrvBean s: list){
//			System.out.println(s.getStateName());
//		}
//		MiddleInterfaceF midF =new MiddleInterfaceF();
//		for(StateAbbrv s:midF.printStateAbb()){
//			System.out.println(s.getStateName());
//		}
		return "updateProduct";
	}
	@RequestMapping(value="updateClientList.do", method=RequestMethod.GET)
	public String updateClientList(HttpServletRequest req){
		req.setAttribute("myclient", new Client());
		return "updateClientList";
	}
	@RequestMapping(value="registerProduct.do", method=RequestMethod.POST)
	public ModelAndView registerProduct(@ModelAttribute("newProduct") @Valid Product newProduct,
			BindingResult bindingResult,
			HttpServletRequest req,
			HttpServletResponse resp){
		if(bindingResult.hasErrors()){
			System.out.println("Error");
			return new ModelAndView("updateProduct");
		}
		System.out.println("!Error");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
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
