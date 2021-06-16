package com.nt;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("SpringBootServletInitializer is called...");
		return application.sources(MvcProj27BootFileUploadingFiledownloadingApplication.class);
	}

}
