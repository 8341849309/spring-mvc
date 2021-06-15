package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.nt.controller")
public class WebMVCConfig {

	@Bean
	public InternalResourceViewResolver createIRVR() {
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
		
		return resolver;
	}
	
	
}
