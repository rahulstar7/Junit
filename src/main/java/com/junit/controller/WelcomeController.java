package com.junit.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {

	
	
	@GetMapping("/")
	public String getMsg()
	{
		return "This is the demo method";
	}
}
