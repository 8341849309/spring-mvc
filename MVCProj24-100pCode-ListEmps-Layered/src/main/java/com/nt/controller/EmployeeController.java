package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl ser;
	
	@GetMapping("/welcome")
	public String showHome() {
		System.out.println("EmployeeController.showHome()");
		
		return "home";
	}
	
	@GetMapping("/showEmps")
	public String showEmps(Map<String, Object> map) {
		System.out.println("EmployeeController.showEmps()");
		
		List<Employee> list=ser.fetchAllEmps();
		
		map.put("listEmps", list);
		
		return "result";
	}
	
}
