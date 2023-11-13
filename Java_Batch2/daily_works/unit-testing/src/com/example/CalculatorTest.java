package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator cal;
	
	@BeforeEach
	public void init() {
		System.out.println("Init Test");
		cal =new Calculator();
	}
	
	
	@AfterEach
	public void testDown() {
		System.out.println("Tets Completed");
		cal=null;
	}
	@Test
	public void testAdd() {
		
		//Given
		int x=10 ,y=20;
		
		//When
		int result = cal.add(x,y);
		
		//Then
		assertEquals(30, result);
	}
	
	@Test
	public void testLarge()
	{
		int x=10, y=20;
		int res=cal.findLargest(x, y);
		assertEquals(20,res);
	}
	
	@Test
	public void testDivide()
	{
		Calculator cal= new Calculator();
		assertEquals(10,cal.divide(100, 10));
		
		assertThrows(ArithmeticException.class,()->cal.divide(10,0));
	}
	

}
