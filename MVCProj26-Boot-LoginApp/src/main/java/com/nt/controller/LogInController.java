package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.LogIn;
import com.nt.service.ILogInService;

@Controller
public class LogInController {

	@Autowired
	private ILogInService ser;

	@GetMapping("/login")
	public String logInPage() {

		return "logInForm";
	}

	@PostMapping("/validate")
	public String validate(Map<String, Object> map, @ModelAttribute LogIn login) {

		int count = 0;

		count = ser.validate(login);

		if (count == 0) {
			map.put("result", "Invalid Credentails");
			return "logInForm";
		}

		else {
			map.put("result", "Logged In Successfully...");
			return "result";
		}
		
	}

}
