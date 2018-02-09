package org.bibin.controller;

import org.bibin.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.bibin.dao.*;
import org.bibin.onlineshoppingbackend.dao.CategoryDao;
import org.bibin.onlineshoppingbackend.daoimpl.CategoryDaoImpl;
import org.bibin.onlineshoppingbase.dto.Category;
import org.bibin.bean.*;

@Controller

public class PageController {
	@Autowired
	private CategoryDao categoryDao;
	

	@RequestMapping(value= {"/","/index"})  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("home","command",new User());
	}
	
	@RequestMapping(value= "/home")
	public ModelAndView home()
	{
		ModelAndView model=new ModelAndView("/home");
		model.addObject("title","home");
		model.addObject("categories", categoryDao.list());
		model.addObject("userClickHome","true");
		return model;
		
	}
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView model=new ModelAndView("/home");
		model.addObject("title","about");
		model.addObject("userClickAbout","true");
		return model;
	}
	
	@RequestMapping("/services")
	public ModelAndView services()
	{
		ModelAndView model=new ModelAndView("/home");
		model.addObject("title","services");
		model.addObject("userClickServices","true");
		return model;
	}
	@RequestMapping("/contact")
	public ModelAndView contact()
	{
		ModelAndView model=new ModelAndView("/home");
		model.addObject("title","contact");
		model.addObject("userClickContact","true");
		return model;
	}
	
	@RequestMapping("/Example")
	public ModelAndView example()
	{
		ModelAndView model=new ModelAndView("/Example");
		model.addObject("command",new Category());
		model.addObject("categories", categoryDao.list());
		return model;
	}
/***
	product list page with dynamic content
	
	**/
	
	@RequestMapping(value= "/product/list/allItems")
	public ModelAndView allItems()
	{
		ModelAndView model=new ModelAndView("home");
		model.addObject("title","AllItems");
		//passing category list
		model.addObject("categories", categoryDao.list());
		model.addObject("userClickAllItems","true");
		return model;
		
	}
	
	
	@RequestMapping(value= "/show/category/{id}/product")
	public ModelAndView categoryProduct(@PathVariable("id")int id)
	{
		ModelAndView model=new ModelAndView("home");
		
//		categoryDao to fetch singel one
		Category category=null;
				
		category=categoryDao.get(id);
		
		model.addObject("title",category.getName());
		//passing category list
		model.addObject("categories", categoryDao.list());
		
		//passin category singal list product
		model.addObject("category",category);
		model.addObject("userClickCategoryItem","true");
		return model;
		
	}
	
	
}
