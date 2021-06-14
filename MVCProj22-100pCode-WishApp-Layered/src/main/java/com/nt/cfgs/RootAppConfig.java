package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.service")
public class RootAppConfig {

	@Bean
	public LocalDateTime createDT() {
		
		return LocalDateTime.now();
	}
	
}
