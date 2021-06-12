package com.nt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerController {

	@GetMapping("/welcome")
	public String showHome(@ModelAttribute Customer cust) throws ParseException {
		System.out.println("CustomerController.showHome()");
		
		return "cust_form";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Customer cust, Map<String, Object> map) {
		System.out.println("CustomerController.register()");

		map.put("cust", cust);

		return "result";
	}

	@InitBinder
	public void myInitBinder(ServletRequestDataBinder binder) {
		System.out.println("CustomerController.myInitBinder()");

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

}
