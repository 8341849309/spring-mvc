package com.nt.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class EmployeeBO {

	private int empId;
	@NonNull
	private String ename;
	private float salary;
	private String addrs;
	
}
