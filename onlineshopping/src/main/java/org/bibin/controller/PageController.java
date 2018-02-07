package org.bibin.controller;

import org.bibin.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.bibin.dao.*;
import org.bibin.bean.*;

@Controller

public class PageController {
	@Autowired
	UserDao use=null;
	

	@RequestMapping(value= {"/","/index"})  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("home","command",new User());
	}
	
	@RequestMapping(value= "/home")
	public ModelAndView home()
	{
		ModelAndView model=new ModelAndView("home");
		model.addObject("title","home");
		model.addObject("userClickHome","true");
		return model;
		
	}
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView model=new ModelAndView("home");
		model.addObject("title","about");
		model.addObject("userClickAbout","true");
		return model;
	}
	
	@RequestMapping("/services")
	public ModelAndView services()
	{
		ModelAndView model=new ModelAndView("home");
		model.addObject("title","services");
		model.addObject("userClickServices","true");
		return model;
	}
	@RequestMapping("/contact")
	public ModelAndView contact()
	{
		ModelAndView model=new ModelAndView("home");
		model.addObject("title","contact");
		model.addObject("userClickContact","true");
		return model;
	}
	
//	Login and OTP files
	
	
	
	
	
	
	
}
