package com.nt.dao;

import java.util.List;
import java.util.Map;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	
	public List<Map<String, Object>> getEmployees();
	
	public int createEmployee(Employee emp);
	
	public int updateEmployee(Employee emp);
	
	public int deleteEmployee(int eno);
	
}
