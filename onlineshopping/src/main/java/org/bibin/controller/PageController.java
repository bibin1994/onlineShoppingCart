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
	

	@RequestMapping("/")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("home","command",new User());
	}
	
	@RequestMapping(value= "/home")
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
	
	@RequestMapping("/services")
	public ModelAndView services()
	{
		ModelAndView model=new ModelAndView("services");
		return model;
	}
	@RequestMapping("/contact")
	public ModelAndView contact()
	{
		ModelAndView model=new ModelAndView("contact");
		return model;
	}
	
//	Login and OTP files
	
	
	
	
	
	
	
}
