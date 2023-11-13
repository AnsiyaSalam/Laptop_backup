package com.ust.customerjpa.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.ust.customer.jpa.exception.CustomerNotFoundException;
import com.ust.customer.jpa.exception.DuplicateFoundException;
import com.ust.customerjpa.model.Customer;
import com.ust.customerjpa.model.UserType;
import com.ust.customerjpa.repository.CustomerRepo;

@ExtendWith(MockitoExtension.class)
class CustomerServiceImplUnitTest {
	
    @Mock
    private CustomerRepo repo;

    @InjectMocks
    private CustomerServiceImpl service;
	
//	@Autowired
//	private CustomerService service;
	
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
		Customer c2 = new Customer(107, "rejin", "rejin@yahoo.com", LocalDate.of(2000, 02, 25),  UserType.GENERAL);
		
		// when
		when(repo.save(c1)).thenReturn(c1);
		when(repo.save(c2)).thenThrow(new DuplicateFoundException("Duplicate Customer"));

		Customer savedCustomer = service.addCustomer(c1);
		
		// then
		assertEquals(c1, savedCustomer);
		assertThrows(DuplicateFoundException.class, ()->service.addCustomer(c2));
		
		// verify whether repo.save() method is called 1 time
		verify(repo,times(1)).save(c1);
		verify(repo,times(1)).save(c2);
	}
	
	@Test
	void testGetCustomer() {
		
		// given
		int id1 = 101;
		int id2 = 100;
		Customer c1=new Customer(110,"alfiya","alfiya@gmail.com", LocalDate.of(1996, 04, 12),UserType.GENERAL);
		
		// when
		when(repo.findById(id1)).thenReturn(Optional.of(c1));
	    when(repo.findById(id2)).thenThrow(CustomerNotFoundException.class);

		
		// then
	    assertEquals(c1, service.getCustomer(id1));
	    assertThrows(CustomerNotFoundException.class, ()->service.getCustomer(id2));
	      
	    // verify  
	    verify(repo,times(1)).findById(id1);
	    verify(repo,times(1)).findById(id2);
	}

	@Test
	void testUpdateCustomer() {
		
		// given
		Customer c6=new Customer(104,"hvfh","hvfh@yahoo.com", LocalDate.of(1999, 06, 26), UserType.GENERAL);
		Customer c7=new Customer(108,"dfgh","dfgh@yahoo.com", LocalDate.of(1999, 06, 26), UserType.GENERAL);
     
		// when
        when(repo.existsById(104)).thenReturn(true);
        when(repo.existsById(108)).thenReturn(false);
        when(repo.save(c6)).thenReturn(c6);
        lenient().when(repo.save(c7)).thenThrow(CustomerNotFoundException.class);

        Customer updatedCustomer=service.updateCustomer(c6);

        // then
        assertEquals(c6,updatedCustomer);
        assertThrows(CustomerNotFoundException.class,()->service.updateCustomer(c7));

        // verify
        verify(repo, times(1)).save(c6);
        verify(repo, times(1)).existsById(104);
        verify(repo, times(1)).existsById(108);
	}
	
	@Test
	void testDeleteCustomer() {
		
		// given
		int id1 = 101;
		int id2 = 100;
		
		// when
		when(repo.existsById(id1)).thenReturn(true);
		when(repo.existsById(id2)).thenReturn(false);
		
		// then
		assertDoesNotThrow(()->service.deleteCustomer(id1));
		assertThrows(CustomerNotFoundException.class, ()->service.deleteCustomer(id2));
		
		//verify
		verify(repo, times(1)).deleteById(id1);
		verify(repo, times(1)).existsById(id2);
		
	}
	
	@Test
	void testGetAllCustomer() {
		assertNotNull(service);
		service.getAllCustomer();
	}

	@Test
	void testFindByCustomerByName() {
		String name="alfiya";
		String name2="Anson";
		
		// given
		Customer c1=new Customer(110,"alfiya","alfiya@gmail.com", LocalDate.of(1996, 04, 12),UserType.GENERAL);
		
		// when
		when(repo.findByCustomerName(name)).thenReturn(Optional.of(c1));
		when(repo.findByCustomerName(name2)).thenThrow(new CustomerNotFoundException("Customer not found"));
		
		// then
		assertEquals(c1,service.getCustomerByName(name));
		assertThrows(CustomerNotFoundException.class, ()->service.getCustomerByName(name2));
		
		// verify
		verify(repo,times(1)).findByCustomerName(name);
		verify(repo,times(1)).findByCustomerName(name2);
	}

	@Test
	void testFindByEmail() {
		String email="alfiya@yahoo.com";
		
		// given
		Customer c1=new Customer(110,"alfiya","alfiya@gmail.com", LocalDate.of(1996, 04, 12),UserType.GENERAL);
		
		// when
		when(repo.findByEmail(email)).thenReturn(Optional.of(c1));
		
		// then
		assertEquals(c1,service.findByEmail(email));
		
		// verify
		verify(repo,times(1)).findByEmail(email);
	}

//	@Test
//	void testFindByDobRange() {
//		String email = "ajmiya@yahoo.com";
//		
//		// given
//		Customer c1=new Customer(110,"ajmiya","ajmiya@gmail.com", LocalDate.of(1996, 04, 12),UserType.GENERAL);
//		
//		// then
//		assertEquals(c1,service.findByDobRange(from, to));
//		
//		// verify
//		verify(repo,times(1)).findCustomerInDobRange(from, to);
//	}

//	@Test
//	void testGetIdInRange() {
//		
//	}

}
