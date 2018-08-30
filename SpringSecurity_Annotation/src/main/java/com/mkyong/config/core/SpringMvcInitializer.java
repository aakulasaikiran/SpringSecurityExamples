package com.mkyong.config.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mkyong.config.AppConfig;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	Logger logger = LoggerFactory.getLogger("SpringMvcInitializer");
	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.debug(" in side getRootConfigClasses");
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.debug(" in side getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		logger.debug(" in side getServletMappings");
		return new String[] { "/" };
	}
	
}