package com.boot.spring.jpa.exception;

public class InsufficientAmountException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientAmountException(String message) {
		super(message);
	}

}
