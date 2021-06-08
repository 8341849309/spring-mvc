package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	/*
	 * @RequestMapping("/wish.htm") public ModelAndView showWishMessage() {
	 * System.out.println("ShowHomeController.showWishMessage()");
	 * 
	 * String msg = generator.wishMessage();
	 * 
	 * ModelAndView mav = new ModelAndView(); mav.addObject("wMsg", msg);
	 * mav.addObject("sysDate", new Date());
	 * 
	 * mav.setViewName("result");
	 * 
	 * return mav; }
	 */

	/*
	 * @RequestMapping("/wish.htm") public String showWishMessage(Model model) {
	 * System.out.println("ShowHomeController.showWishMessage()");
	 * 
	 * String msg = generator.wishMessage();
	 * 
	 * model.addAttribute("wMsg", msg); model.addAttribute("sysDate", new Date());
	 * 
	 * return "result"; }
	 */

	/*
	 * @RequestMapping("/wish.htm") public String showWishMessage(ModelMap model) {
	 * System.out.println("ShowHomeController.showWishMessage()");
	 * 
	 * String msg = generator.wishMessage();
	 * 
	 * model.addAttribute("wMsg", msg); model.addAttribute("sysDate", new Date());
	 * 
	 * return "result"; }
	 */

	@RequestMapping("/wish.htm")
	public String showWishMessage(Map<String, Object> map) {
		System.out.println("ShowHomeController.showWishMessage()-->" + map.getClass());

		String msg = generator.wishMessage();

		map.put("wMsg", msg);
		map.put("sysDate", new Date());

		return "result";
	}

}
