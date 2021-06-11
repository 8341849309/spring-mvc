package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;
import com.nt.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService ser;

	@GetMapping("/welcome")
	public String showHome(@ModelAttribute Customer cust) {
		System.out.println("CustomerController.showHome()");

		return "cust_form";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Customer cust, Map<String, Object> map) {
		System.out.println("CustomerController.register()");

		map.put("cust", cust);
		
		return "result";
	}

	@ModelAttribute("gendersList")
	public List<String> populateGenders() {

		List<String> gendersList = ser.populateGenders();

		return gendersList;
	}

	@ModelAttribute("hobbiesList")
	public List<String> populatehobbies() {

		List<String> hobbiesList = ser.populatehobbies();

		return hobbiesList;
	}

	@ModelAttribute("countriesList")
	public List<String> populateCountries() {

		List<String> countriesList = ser.populateCountries();

		return countriesList;
	}

	@ModelAttribute("languagesList")
	public List<String> populateLanguages() {

		List<String> languagesList = ser.populateLanguages();

		return languagesList;
	}

}
