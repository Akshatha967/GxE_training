package com.galaxe.Swiggy_.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 

@Configuration
@ComponentScan(basePackages = "com.galaxe.Swiggy_.contoller")
public class CalConfig {

}
