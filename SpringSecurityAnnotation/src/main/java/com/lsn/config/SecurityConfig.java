package com.lsn.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	Logger logger = LoggerFactory.getLogger("SecurityConfig");

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
		logger.debug("auth" + auth);

		auth.inMemoryAuthentication().withUser("dba").password("dba").roles("DBA");
		logger.debug("auth" + auth);

		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
		logger.debug("auth" + auth);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')").antMatchers("/dba/**")
				.access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')").antMatchers("/user/**")
				.access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')").and().formLogin();
		logger.debug("http " + http);

	}
}
