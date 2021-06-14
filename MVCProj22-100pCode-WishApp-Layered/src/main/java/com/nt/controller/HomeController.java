package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.IWishMessageGenerator;

@Controller
public class HomeController {

	@Autowired
	private IWishMessageGenerator generator;

	@GetMapping("/welcome")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");

		return "home";
	}

	@GetMapping("/wish")
	public String wishMessage(Map<String, Object> map) {
		System.out.println("HomeController.wishMessage()");

		String msg = generator.wishMessage();

		map.put("wMsg", msg);

		return "result";
	}

}
