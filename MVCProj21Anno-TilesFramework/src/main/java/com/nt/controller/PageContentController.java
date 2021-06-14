package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageContentController {

	@GetMapping("/welcome")
	public String homePage() {
	
		return "homePageDef";
	}
	
	@GetMapping("/java")
	public String javaPage() {
		
		return "javaPageDef";
	}
	
	@GetMapping("/oracle")
	public String oraclePage() {
		
		return "oraclePageDef";
	}
	
	@GetMapping("/dotnet")
	public String dotNetPage() {
		
		return "dotNetPageDef";
	}
	
}
