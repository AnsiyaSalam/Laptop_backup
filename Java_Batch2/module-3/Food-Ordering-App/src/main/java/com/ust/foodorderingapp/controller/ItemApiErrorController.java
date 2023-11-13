package com.ust.foodorderingapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ust.foodorderingapp.exception.DuplicateItemException;
import com.ust.foodorderingapp.exception.InvalidCategoryException;
import com.ust.foodorderingapp.exception.ItemNotFoundException;

@RestControllerAdvice
public class ItemApiErrorController {
	
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidCategoryException.class)
	public String ItemErrorHandle(InvalidCategoryException ex)
	{
		return ex.getMessage();
		
	}
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(DuplicateItemException.class)
	public String ItemDuplicateHandle(DuplicateItemException ex)
	{
		return ex.getMessage();
	}
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ItemNotFoundException.class)
	public String ItemDuplicateHandle(ItemNotFoundException ex)
	{
		return ex.getMessage();
	}
		

}
