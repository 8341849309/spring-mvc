package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.model.Employee;

@Service
public class EmployeeServiceImpl {

	public List<Employee> fetchAllEmps() {
		System.out.println("EmployeeServiceImpl.fetchAllEmps()");
		
		List<Employee> list= List.of(
				new Employee(100, "Venkateswarlu", "MPL", 30600f),
				new Employee(101, "Neeraja", "Palakkad", 30600f),
				new Employee(102, "Siva", "MPL", 30600f),
				new Employee(103, "Venkateswarlu", "MPL", 30600f)
				);
		
		return list;
	}
}
