package com.galaxe.Swiggy_.contoller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 

@Controller
public class CalCntroller {

	 @RequestMapping("/welcome") 
	    @ResponseBody
	  
	    // Method 
	    public String helloGfg() 
	    { 
	        return "Welcome to swiggy!"; 
	    } 
}

