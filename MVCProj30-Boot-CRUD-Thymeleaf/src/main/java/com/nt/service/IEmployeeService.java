package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeService {

	public String registerEmployee(Employee emp);

	public List<Employee> getEmployees();

	public String updateEmployee(Employee emp);

	public String deleteEmployee(int eno);

}
