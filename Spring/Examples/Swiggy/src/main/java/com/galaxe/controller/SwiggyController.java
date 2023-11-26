package com.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/welcome.html")
public class SwiggyController {

	@RequestMapping("/welcome.html")
	public String displayWelcomePage() {
		return "SwiggyHome"; // logical view name to be returned by the controller.
	}
}
