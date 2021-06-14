package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.cfgs.RootAppConfig;
import com.nt.cfgs.WebMVCConfig;

public class MyWebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext sc) throws ServletException {

		AnnotationConfigWebApplicationContext pCtx = new AnnotationConfigWebApplicationContext();
		pCtx.register(RootAppConfig.class);

		ContextLoaderListener listener = new ContextLoaderListener(pCtx);
		sc.addListener(listener);

		AnnotationConfigWebApplicationContext cCtx = new AnnotationConfigWebApplicationContext();
		pCtx.register(WebMVCConfig.class);

		DispatcherServlet servlet = new DispatcherServlet(cCtx);

		ServletRegistration.Dynamic dyna = sc.addServlet("ds", servlet);

		dyna.addMapping("/");
		dyna.setLoadOnStartup(2);

	}

}
