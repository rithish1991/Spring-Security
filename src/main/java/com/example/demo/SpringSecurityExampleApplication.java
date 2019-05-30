package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan({"com.resources","com.config"})
public class SpringSecurityExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityExampleApplication.class, args);
	}

}
