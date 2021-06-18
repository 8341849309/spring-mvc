package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;

	@Override
	public String registerEmployee(Employee emp) {
		System.out.println("EmployeeServiceImpl.registerEmployee()");

		int count = dao.createEmployee(emp);

		if (count > 0)
			return "Employee registered successfully!!!";
		else
			return "Employee registration failed!!!";

	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("EmployeeServiceImpl.getEmployees()");

		List<Map<String, Object>> listEmps = dao.getEmployees();
		List<Employee> list = new ArrayList<Employee>();

		listEmps.forEach(map -> {
			Employee e = new Employee();
			e.setEno(Integer.parseInt(map.get("ENO").toString()));
			e.setEname(map.get("ENAME").toString());
			e.setAddrs(map.get("ADDRS").toString());
			e.setEsal(Float.parseFloat(map.get("ESAL").toString()));
			
			list.add(e);
		});

		return list;
	}

	@Override
	public String updateEmployee(Employee emp) {
		System.out.println("EmployeeServiceImpl.updateEmployee()");

		int count = dao.updateEmployee(emp);

		if (count > 0)
			return "Employee Updated Successfully!!!";
		else
			return "Employee not update!!!";

	}

	@Override
	public String deleteEmployee(int eno) {
		System.out.println("EmployeeServiceImpl.deleteEmployee()");

		int count = dao.deleteEmployee(eno);

		if (count > 0)
			return "Employee deleted Successfully!!!";
		else
			return "Employee not deleted!!!";

	}

}
