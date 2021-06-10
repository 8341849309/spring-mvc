package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {
	
	private static final String INSERT_CUST_QUERY="INSERT INTO CUSTOMER(CUSTNAME,CUSTADDRS,BILLAMT) VALUES(?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;
	
	public int insertCustomer(Customer cust) {
		System.out.println("CustomerDAOImpl.insertCustomer()");
		
		int count=jt.update(INSERT_CUST_QUERY, cust.getCname(),cust.getCadd(),cust.getBillAmt());
		
		return count;
	}

}
