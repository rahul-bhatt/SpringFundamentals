package com.pluralsight.spring_sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
        
        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
