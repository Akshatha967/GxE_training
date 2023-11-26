package com.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlllersMvc {

	@RequestMapping("/Home")
	public String renderHome(){
		return "Home";
	}
}
