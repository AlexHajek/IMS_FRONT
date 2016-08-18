package org.ims.controllers;

import java.util.List;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.ims.beans.Person;
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
public class FirstController implements ServletContextAware,
										InitializingBean
{
	@Autowired
	private ServletContext servletContext; //instance var
	
	@RequestMapping(value="hello.do", method=RequestMethod.GET)
	public String hello(HttpServletRequest req){
		req.setAttribute("pickle", new Person()); // commandName=this blank object
		return "hello";
	}
	@RequestMapping(value="register.do", method=RequestMethod.POST)
	public ModelAndView register(
			@ModelAttribute("pickle") @Valid Person pickle,
			BindingResult bindingResult,
			HttpServletRequest req,
			HttpServletResponse resp
			){
		if(bindingResult.hasErrors()){
			return new ModelAndView("hello");
		}

		@SuppressWarnings("unchecked")
		Vector<Person> peeps = 
				(Vector<Person>)this.servletContext.getAttribute("people");
		peeps.add(pickle);
		this.servletContext.setAttribute("people", peeps); //update peeps
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view"); // view.jsp IRVR
		mv.addObject("success", "Successfully added person!"); // request-scoped variables
		req.getSession().setAttribute("user", "Dan Pickles");
		return mv;
	}
	
	
	
	
	
	
	// "init" method of InitializingBean
	public void afterPropertiesSet() throws Exception {
		List<Person> peeps = new Vector<>();
		servletContext.setAttribute("people", peeps); //app scope
	}
	public void setServletContext(ServletContext ctxt) {
		this.servletContext = ctxt;
	}


	
}
