package com.boot.tutorial.exception;

public class CustomerNotFoundException extends RuntimeException{
	
	public CustomerNotFoundException(String message) {
		super(message);	
	}

}
