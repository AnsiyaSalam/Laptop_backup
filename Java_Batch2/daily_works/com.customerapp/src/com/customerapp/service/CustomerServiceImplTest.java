package com.customerapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.customerapp.model.Customer;

class CustomerServiceImplTest {
	
	CustomerServiceImpl service;
	@BeforeEach
	public void setUp()
	{
		service = new CustomerServiceImpl();
		Customer c1=new Customer(2,"sidhu","sidhu@gmail.com");
		Customer c2=new Customer(3,"rohit","rohit@gmail.com");
		Customer c3=new Customer(4,"rejin","rejin@gmail.com");
		
		service.addCustomer(c1);
		service.addCustomer(c2);
		service.addCustomer(c3);
	}
	
	@AfterEach
	public void tearDown() {
		service=null;
	}
	
	@Test
	void testAddCustomer()
	{
		Customer c=new Customer(1,"ansi","ansi@gmail.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerById(1));
	}
	
	@Test
	void testGetCustomerById()
	{
		assertNotNull(service.getCustomerById(3));
	}
	
	@Test
	void testDeleteCustomer() {
		service.deleteCustomer(2);
		assertNull(service.getCustomerById(2));
	}
	
	@Test
	void testGetCustomerByName()
	{
		assertNotNull(service.getCustomerByName("sidhu"));
	}
	

	
	@Test
	void testGetAllCustomer()
	{
		List<Customer> c=service.getAllCustomer();
		assertTrue(c.size()==3);
	}

}
