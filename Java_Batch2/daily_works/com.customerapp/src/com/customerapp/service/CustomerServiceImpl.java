package com.customerapp.service;

import java.util.List;

import com.customerapp.model.Customer;
import com.customerapp.repository.CustomerRepo;
import com.customerapp.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepo cr=new CustomerRepoImpl();

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		cr.addCustomer(c);
		
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return cr.getCustomerById(id);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
	    cr.deleteCustomer(id);
		
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return cr.getCustomerByName(name);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return cr.getAllCustomer();
	}
}
