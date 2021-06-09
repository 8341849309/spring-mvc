package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.bo.EmployeeBO;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@RequestMapping("/home")
	public String showHome() {
		System.out.println("EmployeeController.showHome()");

		return "home";
	}

	@RequestMapping("/showEmps")
	public String showEmps(Map<String, Object> map) {
		System.out.println("EmployeeController.showEmps()");
		
		List<EmployeeBO> listBO=service.fetchAllEmps();
		
		map.put("listBO", listBO);
		
		return "show_Emps";
	}

}
