package com.gxe.springmvc.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.gxe.springmvc.AddController;
import com.gxe.springmvc.config.MvcConfigss;

//responsible to tell  -> java config

public class MyFrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("config loading");
		return new Class[] {MvcConfigss.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {MvcConfigss.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		// for all the request -> use frontcontroller
		
		return new String[] {"/"};
	}

	@Override
	protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
		// TODO Auto-generated method stub
		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);

	    // Set the throwExceptionIfNoHandlerFound property to true
	    dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);

	    // Return the customized DispatcherServlet
	    return dispatcherServlet;
	  }
	

}
