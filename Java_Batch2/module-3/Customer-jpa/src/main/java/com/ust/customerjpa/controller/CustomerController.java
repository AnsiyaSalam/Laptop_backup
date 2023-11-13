package com.ust.customerjpa.controller;
import com.ust.customerjpa.repository.CustomerRepo;

//import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//import com.ust.app.customer.repository.CustomerRepo;
import com.ust.customerjpa.model.Customer;
//import com.ust.customerjpa.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

		
		@Autowired
		private CustomerRepo repo;

		@PostMapping("/addcustomer")
		public ResponseEntity<Customer> create(@RequestBody Customer customer){
			repo.save(customer);
			return ResponseEntity.ok().body(customer);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Customer> getcustomer(@PathVariable int id){
			Optional<Customer> customers=repo.findById(id);
			if(customers.isPresent()) {
				return ResponseEntity.ok().body(customers.get());
			}	else {
				return ResponseEntity.noContent().build();
			}
		}
		
		@PutMapping("/update/{id}")
		public ResponseEntity<Customer> update(@PathVariable int id, @RequestBody Customer customer){
			Customer cust = null;
			Optional<Customer> updatecustomer = repo.findById(id);
			if(updatecustomer.isPresent()) {
				cust = updatecustomer.get();
				cust.setId(id);
				cust.setCustomerName(customer.getCustomerName());
				repo.save(cust);
				return ResponseEntity.ok().body(cust);
//				return ResponseEntity.ok().body(repo.save(cust));
			}   else {
			return ResponseEntity.noContent().build();
		}
	}
			
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<Boolean> deleteCustomer(@PathVariable int id){
			Optional<Customer> customer = repo.findById(id);
			if(customer.isEmpty()) {
				return ResponseEntity.ok(false);
			}   else {	
				repo.deleteById(id);
				return ResponseEntity.ok(true);
			}
		}
		
//		@DeleteMapping("/delete/{id}") 
//		public  ResponseEntity<void> delete(@PathVariable int id){
//			Optional<Customer> customer = repo.findById(id);
//			if(customer.isPresent()) {
//				repo.deleteById(id);
//				ResponseEntity.ok().build();
//			}   else {
//				ResponseEntity.noContent().build();
//			}
//		}
				
//	@Autowired
//	private CustomerService service;
//	
//	@ResponseStatus(code=HttpStatus.CREATED)
//	@PostMapping
//	public Customer addCustomer(@RequestBody Customer customer)
//	{
//		return service.addCustomer(customer);
//	}
//	
//	@ResponseStatus(code=HttpStatus.OK)
//	@GetMapping
//	public List<Customer> getAllCustomers()
//	{ 
//		return service.getAllCustomer();
//	}
//	
//	@GetMapping("/{id}")
//	public Customer getCustomer(@PathVariable int id)
//	{
//		return service.getCustomer(id);
//	}
//	
//	@GetMapping("/search")
//	public Customer getCustomerByName(@RequestParam("name") String name)
//	{
//		return service.getCustomerByName(name);
//	}
//	
//	@DeleteMapping("/{id}")
//	@ResponseStatus(code=HttpStatus.OK)
//	public void deleteCustomer(@PathVariable int id)
//	{
//		service.deleteCustomer(id);
//	}
//	
//	@ResponseStatus(code=HttpStatus.ACCEPTED)
//	@PutMapping
//	public Customer  updateCustomer(@RequestBody Customer customer)
//	{
//		return service.updateCustomer(customer);
//	}
//	
//	@GetMapping("/search/{email}")
//	public Customer findByEmail(@PathVariable String email)
//	{
//		return service.findByEmail(email);
//	}
//	
//	@GetMapping("/dob/from/{from}/to/{to}")
//	public List<Customer> searchCustomerByDobRange(@PathVariable String from, @PathVariable String to)
//	{
//		return service.findByDobRange(LocalDate.parse(from),LocalDate.parse(to));
//	}
//	
//	@GetMapping("/id/start/{start}/end/{end}")
//	public List<Customer> searchCustomerByIdRange(@PathVariable int start, @PathVariable int end)
//	{
//		return service.getIdInRange(start, end);
//	}
}
