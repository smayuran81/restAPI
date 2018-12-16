package com.example.restapi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.example.restapi.model"})
public class RestContextConfig {

	public RestContextConfig() {
		super();
		
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		
		final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
		return pspc;
		
	}

}
