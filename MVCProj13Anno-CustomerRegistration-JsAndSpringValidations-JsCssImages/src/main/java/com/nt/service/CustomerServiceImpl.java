package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ICustomerDAO;
import com.nt.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO dao;
	
	public String registorCustomer(Customer cust) {
		System.out.println("CustomerServiceImpl.registorCustomer()");
		
		int count=dao.insertCustomer(cust);
		
		if(count>0)
			return "Customer registered successfully!!!";
		else
			return "Customer registration failed!!!";
	}

}
