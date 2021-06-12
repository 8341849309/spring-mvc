package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerController {

	@GetMapping("/welcome")
	public String showHome(@ModelAttribute Customer cust) {
		System.out.println("CustomerController.showHome()");

		return "cust_form";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Customer cust, Map<String, Object> map) {
		System.out.println("CustomerController.register()");

		float sal=30600.99f;
		
		map.put("cust", cust);

		map.put("sysDate", new Date());
		map.put("amt", sal);
		
		return "result";
	}

}
