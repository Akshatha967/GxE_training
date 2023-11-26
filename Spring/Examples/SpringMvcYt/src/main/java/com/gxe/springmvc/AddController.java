package com.gxe.springmvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {

	//method to take request
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int num1,@RequestParam("t2") int num2) {
		int k = num1+num2;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",k);
		mv.setViewName("result.jsp");
		// write the page to be called after adding
		return mv;
	}
}
