package com.boot.tutorial.exception;

import java.util.HashMap;
import java.util.Map;import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value = {MethodArgumentNotValidException.class})
	public ResponseEntity<Map<String, String>>  handleValidationErrors(MethodArgumentNotValidException ex){
		
		Map<String, String> errorMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->{
			errorMap.put(error.getField(), error.getDefaultMessage());		
		});
		return new ResponseEntity<Map<String,String>>(errorMap,HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = {CustomerNotFoundException.class})
	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
	

}
