package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;
import com.nt.service.ICustomerService;
import com.nt.validator.CustomerValidator;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService ser;
	@Autowired
	private CustomerValidator validator;

	@GetMapping("/cust_form")
	public String customerForm(@ModelAttribute Customer cust) {
		System.out.println("CustomerController.customerForm()");

		return "cust_form";
	}

	@PostMapping("/register")
	public String customerRegister(Map<String, Object> map, @ModelAttribute Customer cust, BindingResult errors) {
		System.out.println("CustomerController.customerRegister()");
		
		if(cust.getVflag().equalsIgnoreCase("no")) {
			System.out.println("Server side Validations...");
			if (validator.supports(cust.getClass()))
				validator.validate(cust, errors);
	
			if (errors.hasErrors())
				return "cust_form";
		}

		String msg = ser.registorCustomer(cust);

		map.put("cust", cust);
		map.put("msg", msg);

		return "result";
	}

}
