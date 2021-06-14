package com.nt.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.cfgs.RootAppConfig;
import com.nt.cfgs.WebMVCConfig;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { RootAppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { WebMVCConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
