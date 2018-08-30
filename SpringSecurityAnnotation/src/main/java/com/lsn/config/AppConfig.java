package com.lsn.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.lsn.*" })
@Import({})
public class AppConfig {
	Logger logger = LoggerFactory.getLogger("AppConfig");

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		logger.debug("viewResolver " + viewResolver);
		viewResolver.setViewClass(JstlView.class);
		logger.debug("viewResolver " + viewResolver);
		viewResolver.setPrefix("/WEB-INF/pages/");
		logger.debug("viewResolver " + viewResolver);
		viewResolver.setSuffix(".jsp");
		logger.debug("viewResolver " + viewResolver);
		return viewResolver;
	}
}
