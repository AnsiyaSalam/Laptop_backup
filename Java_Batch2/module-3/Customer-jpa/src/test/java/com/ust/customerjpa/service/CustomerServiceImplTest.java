package com.ust.customerjpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.customer.jpa.exception.CustomerNotFoundException;
import com.ust.customerjpa.model.Customer;
import com.ust.customerjpa.model.UserType;

@SpringBootTest
class CustomerServiceImplTest {
	
	@Autowired
	private CustomerService service;
	
//	@BeforeEach
//	private void setUp() {
//		Customer c2 = new Customer(102, 'Sidharth', 'sidharth@yahoo.com',LocalDate.of(2000, 02, 25),  UserType.GENERAL);
//		Customer c3 = new Customer(103, 'Anson', 'anson@yahoo.com', LocalDate.of(1998, 10, 03),  UserType.GENERAL);
//		Customer c4 = new Customer(104, 'Alphons', 'alphons@yahoo.com', LocalDate.of(1998, 06, 26),  UserType.GENERAL);
//	service.addCustomer(c2);
//	service.addCustomer(c3);
//	service.addCustomer(c4);
//	}
//	
//	@AfterEach
//	public void tearDown() {
//		service.deleteCustomer(102);
//		service.deleteCustomer(103);
//		service.deleteCustomer(104);
//		
//	}
	
	
	
	@Test
	void testAddCustomer() {
		// Given
		Customer c1 = new Customer(101, "Ansiya", "ansiya@yahoo.com", LocalDate.of(2000, 02, 26),  UserType.GENERAL);
		
		// when
		Customer savedCustomer = service.addCustomer(c1);
		
		// then
		assertEquals(c1, savedCustomer);
	}
	
	@Test
	void testGetCustomer() {
		
		// given
		int id = 102;
		int id2 = 100;
		
		// when
		Customer c1 = service.getCustomer(id);
		
		// then
		assertNotNull(c1);
		assertThrows(CustomerNotFoundException.class, ()->service.getCustomer(id2));
	}

	@Test
	void testUpdateCustomer() {
		Customer c6=new Customer(104,"Ashwin","ashwin@yahoo.com", LocalDate.of(1999, 06, 26), UserType.GENERAL);
		Customer updated = service.updateCustomer(c6);
		assertEquals(c6,updated);
	}
	
	@Test

	void testDeleteCustomer() {
		int id = 104;
		service.deleteCustomer(id);
		assertThrows(CustomerNotFoundException.class, ()->service.getCustomer(id));	
	}

	@Test
	void testGetAllCustomer() {
		List<Customer> list = service.getAllCustomer();
		assertNotEquals(0, list.size());
	}

	@Test
	void testFindByCustomerByName() {
		String name="Rohit";
		String name2="Anson";
		
		// when
		Customer c5=service.getCustomerByName(name2);
		
		// then
		assertNotNull(c5);
		assertThrows(CustomerNotFoundException.class, ()->service.getCustomerByName(name));
	}

	@Test
	void testFindByEmail() {
		String email="anson@yahoo.com";
		
		// when
		Customer c2 = service.findByEmail(email);
		
		// then
		assertNotNull(c2);
		assertEquals(c2,c2);		
	}

	@Test
	void testFindByDobRange() {
		String email = "sidharth@yahoo.com";
		Customer c2 = service.findByEmail(email);
		assertNotNull(c2);
		assertEquals(c2, c2);
	}

	@Test
	void testGetByIdRange() {
		int start = 99;
		int end = 111;
		List<Customer> list = service.getIdInRange(start, end);
		assertNotEquals(0, list.size());
	}

}
