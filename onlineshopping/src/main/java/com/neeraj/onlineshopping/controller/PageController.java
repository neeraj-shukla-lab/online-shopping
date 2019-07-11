package com.neeraj.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/Index" })

	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web-Mvc");

		return mv;
	}

	/*
	 * @RequestMapping(value="/test") public ModelAndView
	 * Test(@RequestParam(value="greeting",required=false) String greeting) {
	 * if(greeting==null) { greeting="Hello There"; }
	 * 
	 * 
	 * ModelAndView mv=new ModelAndView("page"); return mv.addObject("greeting",
	 * greeting); }
	 */

	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView Test(@PathVariable(value = "greeting", required = false) String greeting) {

		ModelAndView mv = new ModelAndView("page");
		return mv.addObject("greeting", greeting);
	}

}
