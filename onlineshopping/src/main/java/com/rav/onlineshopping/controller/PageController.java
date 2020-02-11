package com.rav.onlineshopping.controller;

import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring web mvc");
		return mv;
	}

//
//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) {
////	if (greeting==null) {
////		greeting="hello there";
////	}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
//
//	@RequestMapping(value = "/path/{myname}")
//	public ModelAndView getUserName(@PathVariable(value = "myname") String myName) {
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", myName);
//		return mv;
//
//	}
//
} 
