//package com.gxe.springmvc.controller;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import com.gxe.springmvc.MyFrontController;
//import com.gxe.springmvc.config.MvcConfigss;
//
//import jakarta.servlet.ServletContext;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRegistration;
//
//public class WebInitit implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		
//		System.out.println("init");
//		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//	    rootContext.register(MyFrontController.class);
//
//	    
//	    // Manage the lifecycle of the root application context
//	    servletContext.addListener(new ContextLoaderListener(rootContext));
//
//	    // Create the dispatcher servlet's Spring application context
//		
//		 AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
//		    dispatcherContext.register(MvcConfigss.class);
//
//		    // Register and map the dispatcher servlet
//		    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
//		    dispatcher.setLoadOnStartup(1);
//		    dispatcher.addMapping("/");
//
//	}
//
//}
