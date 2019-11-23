package com.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/logs")
public class Login_Controller {

	
	/*
	 * @RequestMapping(value="/login" , method=RequestMethod.GET) public
	 * ModelAndView loadloginpage() { ModelAndView mav = new ModelAndView("login");
	 * System.out.println("Login method has been called"); return mav; }
	 */
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String loadloginpage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login2" , method=RequestMethod.GET)
	public String loadloginpage2()
	{
		return "login2";
	}
	
}
