package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	String fun() {
		
		
		
		
		
		return "page1.html";
	}
	
	
	
	
	
	

}
