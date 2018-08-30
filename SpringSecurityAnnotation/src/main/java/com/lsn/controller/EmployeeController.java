package com.lsn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	Logger logger = LoggerFactory.getLogger("EmployeeController");

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		logger.info("welcomePage");
		ModelAndView model = new ModelAndView();
		logger.debug("model " + model);
		model.addObject("title", "Happy to Spring SecurityWorld");
		logger.debug("model " + model);
		model.addObject("message", "This is Home Page!");
		logger.debug("model " + model);
		model.setViewName("home");
		logger.debug("model " + model);
		return model;

	}

	
	@RequestMapping(value = "/user**", method = RequestMethod.GET)
	public ModelAndView userPage() {
		logger.info("userPage");
		ModelAndView model = new ModelAndView();
		logger.debug("model " + model);
		model.addObject("title", "Happy to Spring Security World");
		logger.debug("model " + model);
		model.addObject("message", "This is protected page - User Page!");
		logger.debug("model " + model);
		model.setViewName("user");
		logger.debug("model " + model);
		return model;

	}
	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		logger.info("adminPage");
		ModelAndView model = new ModelAndView();
		logger.debug("model " + model);
		model.addObject("title", "Spring Security Admin World");
		logger.debug("model " + model);
		model.addObject("message", "This is protected page - Admin Page!");
		logger.debug("model " + model);
		model.setViewName("admin");
		logger.debug("model " + model);

		return model;

	}

	@RequestMapping(value = "/dba**", method = RequestMethod.GET)
	public ModelAndView dbaPage() {
		logger.info("dbaPage");
		ModelAndView model = new ModelAndView();
		logger.debug("model " + model);
		model.addObject("title", "Happy Spring Security World");
		logger.debug("model " + model);
		model.addObject("message", "This is protected page - DBA Page!");
		logger.debug("model " + model);
		model.setViewName("dba");
		logger.debug("model " + model);
		return model;

	}
}
