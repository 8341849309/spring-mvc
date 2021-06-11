package com.nt.model;

import lombok.Data;

@Data
public class Customer {
	private int cno;
	private String cname;
	private String gender;
	private String[] hobbies;
	private String country;
	private String[] languages;
}
