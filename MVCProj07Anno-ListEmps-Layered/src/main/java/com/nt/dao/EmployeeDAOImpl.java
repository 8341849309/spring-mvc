package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_ALL_EMPS = "SELECT EMPID,ENAME,SALARY,ADDRESS FROM EMPLOYEE";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<Map<String, Object>> getEmployees() {
		System.out.println("EmployeeDAOImpl.getEmployees()");

		List<Map<String, Object>> listBO = jt.queryForList(GET_ALL_EMPS);
		
		return listBO;
	}
	
}
