package com.gxe.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//replaces dispatcher servlet.xml config where we mention component-scan
//if we want ti use beans annotation , then we have to create a bean for addcontroler as well, 
//so if we are using webmvc -> uses annotaion everywhere 

@Configuration
@EnableWebMvc
@ComponentScan("com.gxe.springmvc")
public class MvcConfigss implements WebMvcConfigurer{

	
}
