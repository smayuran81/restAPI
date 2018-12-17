package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.example.restapi.spring.RestAppPersistenceJpaConfig;
import com.example.restapi.spring.RestContextConfig;
import com.example.restapi.spring.RestWebConfig;



@SpringBootApplication
@Import({
	RestContextConfig.class,
	RestAppPersistenceJpaConfig.class,
	RestWebConfig.class
})
public class RestApp extends SpringBootServletInitializer {
	

	public static void main(String[] args) {
		SpringApplication.run(RestApp.class, args);
	}
	
/*	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}
	
	@Bean
	public ServletRegistrationBean dispatchServletRegistration() {
		
		final ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(),"/api");
		
		final Map<String,String> params = new HashMap<String,String>();
		params.put("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
		params.put("contextConfigLocation","org.spring.sec2.spring");
		params.put("dispatchOptionsRequest", "true");
		registration.setInitParameters(params);
		
		registration.setLoadOnStartup(1);
		return registration;
	}
	
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(RestApp.class);
	}*/


}
