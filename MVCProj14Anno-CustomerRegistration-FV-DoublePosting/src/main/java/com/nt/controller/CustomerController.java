package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String customerRegister(@ModelAttribute Customer cust, BindingResult errors, RedirectAttributes attrs) {
		System.out.println("CustomerController.customerRegister()");

		if (validator.supports(cust.getClass()))
			validator.validate(cust, errors);

		if (errors.hasErrors())
			return "cust_form";

		String msg = ser.registorCustomer(cust);

		attrs.addFlashAttribute("cust", cust);
		attrs.addFlashAttribute("msg", msg);
		
		return "redirect:show";
	}
	
	@GetMapping("/show")
	public String registrationStatus() {
		System.out.println("CustomerController.registrationStatus()");
		
		return "result";
	}

}
