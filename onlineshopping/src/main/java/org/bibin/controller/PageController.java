package org.bibin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","home"})
	public ModelAndView home()
	{
		ModelAndView model=new ModelAndView("home");
		return model;
		
	}
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView model=new ModelAndView("about");
		return model;
	}
	
	@RequestMapping("services")
	public ModelAndView services()
	{
		ModelAndView model=new ModelAndView("services");
		return model;
	}

}
