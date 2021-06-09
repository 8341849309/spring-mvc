package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.dto.Student;

@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String showForm(@ModelAttribute Student st) {
		System.out.println("StudentController.showForm()");
		
		//Display initial values
		st.setSno(1001);
		st.setName("Venkat");
		st.setAvg(74.2f);
		
		return "stud_form";
	}
	
	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute Student st) {
		System.out.println(st);
		
		map.put("stud", st);
		
		return "result";
	}
	
}
