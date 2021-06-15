package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ILogInDAO;
import com.nt.model.LogIn;

@Service
public class LogInServiceImpl implements ILogInService {

	@Autowired
	private ILogInDAO dao;
	
	@Override
	public int validate(LogIn logIn) {
		
		return dao.checkUser(logIn);
	}

}
