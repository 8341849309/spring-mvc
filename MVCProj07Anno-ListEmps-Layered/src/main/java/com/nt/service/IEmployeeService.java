package com.nt.service;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface IEmployeeService {
	
	public List<EmployeeBO> fetchAllEmps();
	
}
