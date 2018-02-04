package org.bibin.controller;

import javax.servlet.http.HttpSession;

import org.bibin.bean.Forgot;
import org.bibin.bean.Mailmim;
import org.bibin.bean.RestPsw;
import org.bibin.bean.User;
import org.bibin.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("rest")
public class LoginController {
	@Autowired
	UserDao use=null;
	Mailmim mm=null;
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView model=new ModelAndView("login","command",new User());
		return model;
	}
	
	@RequestMapping("/logged")
	public ModelAndView fgp(@RequestParam("mailId") String mail,@RequestParam("password") String pass)
	{
		ModelAndView model=new ModelAndView("");
		 User us=new User();
		 us.setMailId(mail);
		 us.setPassword(pass);
		 
	boolean i=use.login(us);
		
		
		return model;
	}
	
	@RequestMapping("/forgot")
	public ModelAndView forgot()
	{
		ModelAndView model=new ModelAndView("forgotpwd","command",new Forgot());
		return model;
	}
	
	@RequestMapping("sendmsg")
	public ModelAndView sendmsg(@ModelAttribute("forgot") Forgot forgot)
	{
		ModelAndView model=new ModelAndView("restpage","command",new RestPsw());
	String random=use.send(forgot);
		model.addObject("rest", random);
		return model;
	}
	
	@RequestMapping("/restpass")
	public ModelAndView restpass(@ModelAttribute("retype") RestPsw res,HttpSession session)
	{
		
		ModelAndView model1=new ModelAndView("restpage","command",new RestPsw());
		String pass1=res.getOtp();
		String pass2=(String) session.getAttribute("rest");
		if(pass1.equals(pass2))
		{
			ModelAndView model=new ModelAndView();
			use.pasUpdate(res);
			model.addObject("redirct:/home");
			return model;
		}
		return  model1;
	}
	
	

}
