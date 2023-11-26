package com.galaxe.swig.controllers;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 

@Controller
@Component
public class CalCntroller {

	 @RequestMapping("/welcome") 
	    @ResponseBody
	  
	    // Method 
	    public String helloGfg() 
	    { 
	        return "Welcome to swiggy!"; 
	    } 
}

