package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping("/welcome")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");

		return "home";
	}

	@RequestMapping("/register")
	public String saveData1() {
		return "result1";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveData2() {
		return "result2";
	}

}
