package com.dxc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;     
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.web.Services.IServices;
import com.dxc.web.pojos.Book;


@Controller
public class Mycontroller 
{
	@Autowired
	IServices iser;
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/addsample")
	public String sample(@ModelAttribute Book b,Model m)
	{
		String s1=iser.add(b);
		m.addAttribute("message", s1);
		return "view";	
	}
	

	

}
