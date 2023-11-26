package com.galaxe.swig.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 

@Configuration
@ComponentScan(basePackages = "com.galaxe.swig.controllers.CalController")
public class CalConfig{
	static {
	System.out.println("config");
	}
}
