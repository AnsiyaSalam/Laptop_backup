//package com.ust.customerjpa.service;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ust.customer.jpa.exception.CustomerNotFoundException;
//import com.ust.customer.jpa.exception.DuplicateFoundException;
//import com.ust.customerjpa.model.Customer;
//import com.ust.customerjpa.repository.CustomerRepo;
//
//
//@Service
//public class CustomerServiceImpl implements CustomerService {
//
//	@Autowired
//	private CustomerRepo repo;
//
//	@Override
//	public Customer addCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		
//		for(Customer c: repo.findAll()) 
//		{
//			if(c.getId()==customer.getId())
//			{
//				throw new DuplicateFoundException("Duplicate customer found");
//			}
//		}
//		return repo.save(customer);
//	}
//
//	@Override
//	public Customer getCustomer(int id) {
//		// TODO Auto-generated method stub
//		Customer customer= repo.findById(id).orElseThrow(()->new CustomerNotFoundException("Customer with ID : "+id+" Not Found"));
//		return customer;
//	}
//
//	@Override
//	public Customer updateCustomer(Customer customer) {
////		 TODO Auto-generated method stub
////		return repo.save(customer);
//		int id=customer.getId();
//		if(!repo.existsById(id)) {
//			throw new CustomerNotFoundException("Customer with id "+id+" not found");
//			}
//		Customer cus=repo.save(customer);
//		return cus;
//		
//	}
//
//	@Override
//	public void deleteCustomer(int id) {
//		// TODO Auto-generated method stub
//		if(! repo.existsById(id))
//		{
//			throw new CustomerNotFoundException("Customer not found");
//		}
//		repo.deleteById(id);
//
//		
//	}
//
//	@Override
//	public List<Customer> getAllCustomer() {
//		// TODO Auto-generated method stub
//		return repo.findAll();
//	}
//
//	@Override
//	public Customer getCustomerByName(String name) {
//		// TODO Auto-generated method stub
////		Customer customer = repo.findByCustomerName(name).get();
////		return customer;
//		return repo.findByCustomerName(name).orElseThrow(()->new CustomerNotFoundException("Customer not found"));
//	}
//
//	@Override
//	public Customer findByEmail(String email) {
//		// TODO Auto-generated method stub
//		Customer customer = repo.findByEmail(email).get();
//		return customer;
//	}
//
//	@Override
//	public List<Customer> findByDobRange(LocalDate from, LocalDate to) {
//		// TODO Auto-generated method stub
//		return repo.findCustomerInDobRange(from, to);
//	}
//
//	@Override
//	public List<Customer> getIdInRange(int start, int end) {
//		// TODO Auto-generated method stub
//		return repo.findIdInRange(start, end);
//	}
//}
