package com.mkyong.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	Logger logger = LoggerFactory.getLogger("HelloController");
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		logger.info("welcomePage");
		ModelAndView model = new ModelAndView();
		logger.debug("model "+model);
		model.addObject("title", "Spring Security Hello World");
		logger.debug("model "+model);
		model.addObject("message", "This is welcome page!");
		logger.debug("model "+model);
		model.setViewName("hello");
		logger.debug("model "+model);
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		logger.info("adminPage");
		ModelAndView model = new ModelAndView();
		logger.debug("model "+model);
		model.addObject("title", "Spring Security Hello World");
		logger.debug("model "+model);
		model.addObject("message", "This is protected page - Admin Page!");
		logger.debug("model "+model);
		model.setViewName("admin");
		logger.debug("model "+model);

		return model;

	}
	
	@RequestMapping(value = "/dba**", method = RequestMethod.GET)
	public ModelAndView dbaPage() {
		logger.info("dbaPage");
		ModelAndView model = new ModelAndView();
		logger.debug("model "+model);
		model.addObject("title", "Spring Security Hello World");
		logger.debug("model "+model);
		model.addObject("message", "This is protected page - Database Page!");
		logger.debug("model "+model);
		model.setViewName("admin");
		logger.debug("model "+model);
		return model;

	}
	
	

}