package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nt.service.IWishMessageGenerator;

public class WishMessageController implements Controller {

	private IWishMessageGenerator generator;
	
	public WishMessageController(IWishMessageGenerator generator) {
		this.generator=generator;
		System.out.println("WishMessageController.WishMessageController()");
	}
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("WishMessageController.handleRequest()");
		
		String msg=generator.wishMessage();
		
		return new ModelAndView("result", "wMsg", msg);
	}

}
