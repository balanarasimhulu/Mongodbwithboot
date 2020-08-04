package com.dxc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Mycontroller 
{
	@Autowired
	Mangodo mon;
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/addsample")
	public String sample(Book b,Model m)
	{
		mon.save(b);
		String message="added";
		m.addAttribute("message", message);
		return "view";	
	}

	

}
