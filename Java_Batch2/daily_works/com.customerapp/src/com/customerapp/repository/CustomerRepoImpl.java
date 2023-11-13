package com.customerapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.customerapp.model.Customer;

public class CustomerRepoImpl implements CustomerRepo{
	List<Customer> customers= new ArrayList<>();

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		customers.add(c);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		
		for(Customer c:customers) 
		{
			if(c.getId()==id)
			{
				return c;
			}
		}
		return null;
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Customer c=getCustomerById(id);
		customers.remove(c);
		
	}

	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		for(Customer c:customers)
		{
			if(c.getName().equalsIgnoreCase(name))
			{
				return c;
			}
		}
		return null;
	}
	

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customers;
	}

	
	
	
}
