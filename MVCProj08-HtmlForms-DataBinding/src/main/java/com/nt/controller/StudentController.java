package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.dto.StudentDTO;

@Controller
public class StudentController {

	@GetMapping("/student_form")
	public String showStudentForm() {

		return "stud_form";
	}

	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute StudentDTO dto) {
		
		System.out.println(dto);
		
		map.put("dto", dto);
		
		return "result";
	}
}
