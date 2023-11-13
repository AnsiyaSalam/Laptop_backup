package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.hellospring.model.Customer;

@RestController
public class SpringHello {
	
	@GetMapping
	public String sayHello()
	{
		return "hello";
	}
	
	@GetMapping("/hello")
	public String greet()
	{
		return " Good morning everyone...";
	}
	
	@GetMapping("/customer")
	public Customer getCustomer()
	{
		Customer c= new Customer(1,"Ansi","ansi@gmail.com");
		return c;
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customer;
	}

}
