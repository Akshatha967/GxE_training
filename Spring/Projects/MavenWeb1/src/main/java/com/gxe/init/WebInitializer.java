package com.gxe.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.gxe.springmvc.AddController;
import com.gxe.springmvc.MVCconfig;

// responsible for routing requests 
// acts as a web.xml file 

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { MVCconfig.class };
	}

	
	// etcetc-servlet-config.java
	// context-path, beans configuration etc present in the original servlet config file is replaced here 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return  new Class[] {AddController.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("000");
		 return new String[] {"/"};
	}

}
