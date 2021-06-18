package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller
@RequestMapping(path = {"/","/emp"})
public class EmployeeController {

	@Autowired
	private IEmployeeService ser;
	
	@GetMapping(path = {"/","/welcome","/home"})
	public String showHome() {
		System.out.println("EmployeeController.showHome()");

		return "home";
	}

	@GetMapping("/emp_form")
	public String showEmployeeForm(@ModelAttribute Employee emp) {
		System.out.println("EmployeeController.showEmployeeForm()");

		return "emp_form";
	}

	@PostMapping("/createEmp")
	public String createEmployee(@ModelAttribute Employee emp, RedirectAttributes attrs) {
		System.out.println("EmployeeController.createEmployee()");

		String msg = ser.registerEmployee(emp);

		attrs.addFlashAttribute("resultMsg", msg);

		return "redirect:home";
	}

	@GetMapping("/show_emps")
	public String showAllEmployees(Map<String, Object> map) {
		System.out.println("EmployeeController.showAllEmployees()");

		List<Employee> list = ser.getEmployees();

		map.put("empList", list);

		return "show_emps";
	}

	@GetMapping("/edit_emp")
	public String editEmployee(@ModelAttribute Employee emp) {
		System.out.println("EmployeeController.editEmployee()");

		return "emp_edit_form";
	}

	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp, RedirectAttributes attrs) {
		System.out.println("EmployeeController.updateEmployee()");

		String msg = ser.updateEmployee(emp);

		attrs.addFlashAttribute("resultMsg", msg);

		return "redirect:home";
	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam int eno, RedirectAttributes attrs) {
		System.out.println("EmployeeController.deleteEmployee()");

		String msg = ser.deleteEmployee(eno);

		attrs.addFlashAttribute("resultMsg", msg);

		return "redirect:home";

	}

}
