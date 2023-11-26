package com.galaxe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// tells the spring that the class is a controller
@Controller
public class SwiggyController {

	// provides routing  information, 
	@RequestMapping("/welcome.html")
	public String displayWelcomePage() {
		System.out.println("display welcome page");
		return "SwiggyHome"; // logical view name to be returned by the controller.
	}
	
}
