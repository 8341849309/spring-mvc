package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/welcome")
	public String showHome() {
		
		return "home";
	}
	
	@GetMapping("/report")
	public String generateReport(Map<String, Object> map, @RequestParam String type) {
	
		Employee e1=new Employee(101, "Venkateswarlu", "Madanapalle", 30600);
		Employee e2=new Employee(102, "Neeraja", "Palakkad", 30600);
		Employee e3=new Employee(103, "Sunil", "Ananthapuram", 30600);
		Employee e4=new Employee(104, "Siva", "SambePalli", 30600);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		map.put("empList", list);
		
		if(type.equalsIgnoreCase("pdf"))
			return "pdfReport";
		else
			return "excelReport";
	}
}
