package com.masai.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {

	@RequestMapping("/hello")
	
	public String sayHello() {
		return "Welcome to string boot";
	}
	
	
}
