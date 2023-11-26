package com.galaxe.swig.init;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.galaxe.swig.config.CalConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
 
public class CalcInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		System.out.println("init");
		 AnnotationConfigWebApplicationContext
         webApplicationContext
         = new AnnotationConfigWebApplicationContext();

     // Registering the spring config class
     webApplicationContext.setConfigLocation("classpath:application-config.xml");

     // Creating a dispatcher servlet object
     DispatcherServlet dispatcherServlet
         = new DispatcherServlet(webApplicationContext);

     // Registering Dispatcher Servlet 
   // with Servlet Context
     ServletRegistration.Dynamic myCustomDispatcherServlet
         = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);

     // Setting load on startup
     myCustomDispatcherServlet.setLoadOnStartup(1);

     // Adding mapping URL
     myCustomDispatcherServlet.addMapping("/");
 }

}
