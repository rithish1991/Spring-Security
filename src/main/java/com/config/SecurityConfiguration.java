package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
			.withUser("rithish") .password("rithish").roles("USER").and()
			.withUser("rohinn").password("rohinn").roles("ADMIN");
	}
	
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.authorizeRequests()
		.anyRequest()
		.fullyAuthenticated()
		.and()
		.httpBasic();
		httpSecurity.csrf().disable();
		
	}
	
	  
}
