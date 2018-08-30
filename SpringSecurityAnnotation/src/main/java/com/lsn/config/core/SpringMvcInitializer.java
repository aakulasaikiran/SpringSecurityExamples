package com.lsn.config.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.lsn.config.AppConfig;

;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	Logger logger = LoggerFactory.getLogger("SpringMvcInitializer");
	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.info("in side getRootConfigClasses");
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.info("in side getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		logger.info("in side getServletMappings");
		return new String[] { "/" };
	}

}
