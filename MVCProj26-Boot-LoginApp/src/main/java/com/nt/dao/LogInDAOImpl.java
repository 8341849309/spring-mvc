package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.LogIn;

@Repository
public class LogInDAOImpl implements ILogInDAO {

	private static final String CHECK_USER_AVALABILITY = "SELECT COUNT(*) FROM LOGIN WHERE USERNAME=? AND PASSWORD=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int checkUser(LogIn logIn) {
		System.out.println(jt.getDataSource().getClass());

		int count = jt.queryForObject(CHECK_USER_AVALABILITY, Integer.class, logIn.getUsername(), logIn.getPassword());

		return count;
	}

}
