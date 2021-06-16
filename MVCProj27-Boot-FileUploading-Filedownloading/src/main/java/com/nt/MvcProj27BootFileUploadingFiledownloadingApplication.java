package com.nt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class MvcProj27BootFileUploadingFiledownloadingApplication {

	static {
		System.out.println("MvcProj27BootFileUploadingFiledownloadingApplication is called...");
	}
	
	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(MvcProj27BootFileUploadingFiledownloadingApplication.
	 * class, args); }
	 */

	@Bean("multipartResolver")
	public CommonsMultipartResolver createCMPResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		return resolver;
	}
	
	
}
