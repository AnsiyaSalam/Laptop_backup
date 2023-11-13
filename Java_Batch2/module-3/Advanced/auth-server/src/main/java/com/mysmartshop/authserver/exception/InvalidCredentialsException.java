package com.mysmartshop.authserver.exception;

public class InvalidCredentialsException extends RuntimeException{
	
	public InvalidCredentialsException(String msg) {
		super(msg);
	}

}
