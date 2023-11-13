package com.ust.customerjpa.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ust.customerjpa.model.Customer;
import com.ust.customerjpa.model.UserType;
import com.ust.customerjpa.service.CustomerService;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = CustomerController.class)
class CustomerControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	CustomerService service;
	
	@Test
	void testGetCustomerById() throws Exception {
		
		// given
		Customer c1 = new Customer(110,"alfiya","alfiya@gmail.com",LocalDate.of(1996, 04, 12),UserType.GENERAL);
		int id = c1.getId();
				
		// when
		when(service.getCustomer(c1.getId())).thenReturn(c1);
		
		// then
		mockMvc.perform(get("/api/customer/" + id))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.id",Matchers.is(110)))
		       .andExpect(jsonPath("$.customerName",Matchers.is("alfiya")))
		       .andExpect(jsonPath("$.email",Matchers.is("alfiya@gmail.com")))
		       .andExpect(jsonPath("$.type",Matchers.is("GENERAL")))
		       .andExpect(jsonPath("$.dob",Matchers.is("1996-04-12")));
	}
	
	@Test
	void testAddCustomer() throws Exception {
		
		// given
		Customer c1 = new Customer(110,"alfiya","alfiya@gmail.com",LocalDate.of(1996, 04, 12),UserType.GENERAL);
		
		// when
		when(service.addCustomer(c1)).thenReturn(c1);
		
		// then
	     mockMvc.perform(post("/api/customer")
	           .contentType(MediaType.APPLICATION_JSON)
	           .content(asJsonString(c1)))
			   .andExpect(status().isCreated())
			   .andExpect(jsonPath("$.id",Matchers.is(110)))
			   .andExpect(jsonPath("$.customerName",Matchers.is("alfiya")))
			   .andExpect(jsonPath("$.email",Matchers.is("alfiya@gmail.com")))
			   .andExpect(jsonPath("$.dob",Matchers.is("1996-04-12")))
			   .andExpect(jsonPath("$.type",Matchers.is("GENERAL")));
			  
		
	}

//	@Test
//	void testGetAllCustomers() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetCustomer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetCustomerByName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteCustomer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateCustomer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFindByEmail() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSearchCustomerByDobRange() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSearchCustomerByIdRange() {
//		fail("Not yet implemented");
//	}
	
	// Helper Method for converting a Java Object to JSON String
		private String asJsonString(Object object) throws Exception {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.registerModule(new JavaTimeModule());
	        return objectMapper.writeValueAsString(object);
		}

}
