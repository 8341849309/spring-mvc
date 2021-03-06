package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller {

	public ShowHomeController() {
		System.out.println("ShowHomeController.ShowHomeController()");
	}
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// B.logic or request processing logic
		Date d = new Date();

		// return MAV
		return new ModelAndView("home", "sysDate", d);
	}

}
