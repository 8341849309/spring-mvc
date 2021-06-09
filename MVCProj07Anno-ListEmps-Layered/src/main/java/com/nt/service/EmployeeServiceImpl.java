package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<EmployeeBO> fetchAllEmps() {
		System.out.println("EmployeeServiceImpl.fetchAllEmps()");
		
		List<Map<String, Object>> listBOs=dao.getEmployees();
		
		List<EmployeeBO> listEmps=new ArrayList<EmployeeBO>();
		
		for (Map<String, Object> map : listBOs) {
			
			EmployeeBO bo=new EmployeeBO();
			
			bo.setEmpId(Long.parseLong(map.get("empid").toString()));
			bo.setEname(map.get("ename").toString());
			bo.setSalary(Float.parseFloat(map.get("salary").toString()));
			bo.setAddrs(map.get("address").toString());
			
			listEmps.add(bo);
		}
		
		return listEmps;
	}

}
