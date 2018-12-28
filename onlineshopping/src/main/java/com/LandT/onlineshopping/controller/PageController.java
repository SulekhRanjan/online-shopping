package com.LandT.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/index","/home"})
	public ModelAndView showPage() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting", "welcome page");
		return modelAndView;

	}
	
	@RequestMapping(value = {"/request"})
	public ModelAndView getRequest(@RequestParam("greetings") String greetings) {
		
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting", "welcome page");
		return modelAndView;
	}

}
