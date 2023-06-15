package com.boot.tutorial.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.dto.CustomerRequestDto;
import com.boot.tutorial.dto.CustomerResponseDto;
import com.boot.tutorial.serviceImpl.CustomerServiceImpl;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@PostMapping("/customers")
	public ResponseEntity<String> saveCustomer(@Valid @RequestBody CustomerRequestDto customerDto){
		return new ResponseEntity<>(customerService.addCustomer(customerDto),HttpStatus.OK);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<CustomerResponseDto>> getAllCustomer() {
		return new ResponseEntity<List<CustomerResponseDto>>(customerService.getAllCustomer(),HttpStatus.OK);
	}
	
	@GetMapping("/customersByName")
	public ResponseEntity<CustomerResponseDto> getCustomerByName(@RequestParam("name") String name){
		return new ResponseEntity<CustomerResponseDto>(customerService.getCustomerByName(name),HttpStatus.OK);
	}
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<CustomerResponseDto> updateCustomer(@PathVariable("id") Integer id ,@Valid @RequestBody CustomerRequestDto customerDto){
		
		return new ResponseEntity<CustomerResponseDto>(customerService.updateCustomer(id, customerDto),HttpStatus.OK);
	}
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer id){
		return new ResponseEntity<String>(customerService.deleteCustomer(id),HttpStatus.OK);
	}

}
