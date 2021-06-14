package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.IWishMessageGenerator;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageGenerator generator;

	@GetMapping("/welcome")
	public String welcomeHome() {

		return "home";
	}

	@GetMapping("/about")
	public String showAboutUsPage() {

		return "about_us";
	}

	@GetMapping("/wish")
	public String generateMessage(Map<String, Object> map) {

		String msg = generator.wishMessage();
		System.out.println(map.getClass());

		map.put("sysDate", new Date());
		map.put("wMsg", msg);
		
		return "result";
	}

}
