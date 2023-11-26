package com.gxe.springmvc;

import org.springframework
.stereotype.Controller;
import org.springframework.web
.bind.annotation.RequestMapping;
import org.springframework.web
.servlet.ModelAndView;

@Controller
public class AddController {

	  @RequestMapping("/greet")
	    public ModelAndView showview()
	    {
	 
	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("result.jsp");
	        mv.addObject("result",
	                     "GeeksForGeeks Welcomes "
	                         + "you to Spring!");
	        return mv;
	    }
}
