package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String CREATE_EMPLOYEE = "INSERT INTO CRUD_EMPLOYEE(ENAME,ADDRS,ESAL) VALUES(?,?,?)";
	private static final String GET_ALL_EMPOYEES = "SELECT ENO,ENAME,ADDRS,ESAL FROM CRUD_EMPLOYEE";
	private static final String UPDATE_EMPLOYEE = "UPDATE CRUD_EMPLOYEE SET ENAME=?,ADDRS=?,ESAL=? WHERE ENO=?";
	private static final String DELETE_EMPLOYEE = "DELETE FROM CRUD_EMPLOYEE WHERE ENO=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<Map<String, Object>> getEmployees() {
		System.out.println("EmployeeDAOImpl.getEmployees()");

		List<Map<String, Object>> list = jt.queryForList(GET_ALL_EMPOYEES);
		System.out.println(list);

		return list;
	}

	@Override
	public int createEmployee(Employee emp) {
		System.out.println("EmployeeDAOImpl.createEmployee()");

		int result = jt.update(CREATE_EMPLOYEE, emp.getEname(), emp.getAddrs(), emp.getEsal());

		return result;
	}

	@Override
	public int updateEmployee(Employee emp) {
		System.out.println("EmployeeDAOImpl.updateEmployee()");

		int count = jt.update(UPDATE_EMPLOYEE, emp.getEname(), emp.getAddrs(), emp.getEsal(), emp.getEno());

		return count;
	}

	@Override
	public int deleteEmployee(int eno) {
		System.out.println("EmployeeDAOImpl.deleteEmployee()");

		int count = jt.update(DELETE_EMPLOYEE, eno);

		return count;
	}

}
