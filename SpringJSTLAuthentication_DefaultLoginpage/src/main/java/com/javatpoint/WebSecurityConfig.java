package com.javatpoint;  
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;    
import org.springframework.security.config.annotation.web.configuration.*;    
import org.springframework.security.core.userdetails.*;    
import org.springframework.security.provisioning.InMemoryUserDetailsManager;  
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;    
@EnableWebSecurity    
@ComponentScan("com.javatpoint")  
 
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {    
  @Bean    
  public UserDetailsService userDetailsService() {    
      InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();    
      manager.createUser(User.withDefaultPasswordEncoder()  
      .username("admin").password("admin").roles("ADMIN").build());  
      manager.createUser(User.withDefaultPasswordEncoder()  
    	      .username("user").password("user").roles("USER").build());  
      return manager;    
  }    
  @Override    
  protected void configure(HttpSecurity http) throws Exception {    
      http.authorizeRequests().  
      antMatchers("/index", "/").permitAll()  
      .antMatchers("/admin","/user").authenticated()  
      .and()  
      .formLogin() // It renders a login form   
      .and()  
      .logout()  
      .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));      
  }    
}