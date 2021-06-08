package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishMessageGenerator;

@Controller
public class ShowHomeController {

	@Autowired
	private IWishMessageGenerator generator;

	@RequestMapping("/welcome.htm")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");

		return "home";
	}

	@RequestMapping("/wish.htm")
	public ModelAndView showWishMessage() {
		System.out.println("ShowHomeController.showWishMessage()");

		String msg = generator.wishMessage();

		return new ModelAndView("result", "wMsg", msg);
	}
}
