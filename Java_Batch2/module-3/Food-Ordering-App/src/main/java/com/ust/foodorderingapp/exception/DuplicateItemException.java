package com.ust.foodorderingapp.exception;

public class DuplicateItemException extends RuntimeException {
	
	public DuplicateItemException(String msg)
	{
		super(msg);
	}

}
