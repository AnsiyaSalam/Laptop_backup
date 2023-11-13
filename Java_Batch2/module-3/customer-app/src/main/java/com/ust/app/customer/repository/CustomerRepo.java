package com.ust.app.customer.repository;

import java.util.List;
import java.util.Optional;

import com.ust.app.customer.model.Customer;



public interface CustomerRepo {

	public Customer addCustomer(Customer customer);
	public Optional<Customer> getCustomer(int id);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByName(String name);
}
