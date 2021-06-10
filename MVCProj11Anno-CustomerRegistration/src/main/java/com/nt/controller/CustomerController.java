package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;
import com.nt.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService ser;
	
	@GetMapping("/cust_form")
	public String customerForm(@ModelAttribute Customer cust) {
		System.out.println("CustomerController.customerForm()");
		
		return "cust_form";
	}

	@PostMapping("/register")
	public String customerRegister(@ModelAttribute Customer cust, Map<String, Object> map) {
		System.out.println("CustomerController.customerRegister()");
		
		String msg=ser.registorCustomer(cust);
		
		map.put("cust", cust);
		map.put("msg", msg);

		return "result";
	}

}
