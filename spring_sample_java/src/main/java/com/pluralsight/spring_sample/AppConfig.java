package com.pluralsight.spring_sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		// Constructor based injection
		// CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository();
		
		// Using autowiring
		CustomerServiceImpl service = new CustomerServiceImpl();
		
		// Setter based injection
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/
}
