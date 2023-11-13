package com.customerapp.repository;

import java.util.List;

import com.customerapp.model.Customer;

public interface CustomerRepo {
	
	public void addCustomer(Customer c);
	public Customer getCustomerById(int id);
	public void deleteCustomer(int id);
	public Customer getCustomerByName(String name);
	public List<Customer> getAllCustomer();

}
