package com.example.restapi.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
// @EnableJpaRepositories(basePackages = "com.example.restapi.persistence.dao")
@ComponentScan({"com.example.restapi.persistence.dao","com.example.restapi.persistence.repository"})
public class RestAppPersistenceJpaConfig {

}
