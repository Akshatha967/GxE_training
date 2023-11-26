package com.gxe.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//WEB-INF/mvc-dispatcher-servlet.xml


@Configuration
@ComponentScan({"com.gxe.springmvc"})
public class MVCconfig extends WebMvcConfigurationSupport{

}
