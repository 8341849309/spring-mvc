package com.nt.model;

import java.util.Date;

import lombok.Data;

@Data
public class Customer {
	private int cno;
	private String cname;
	private Date dob;
	private Date doj;

}
