package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@GetMapping("/login")
	public String showLoginPage(@RequestParam int a) throws Exception {
		
		if (a==0) {
			throw new Exception("Internal Error");
		}
		
		return "login";
	}
	
}


