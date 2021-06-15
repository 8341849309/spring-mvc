package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MvcProj25BootWishAppApplication {

	@Bean
	public LocalDateTime createDT() {
		return LocalDateTime.now();
	}

	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(MvcProj25BootWishAppApplication.class, args); }
	 */
}
