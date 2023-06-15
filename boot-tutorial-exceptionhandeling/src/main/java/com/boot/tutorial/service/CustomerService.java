package com.boot.tutorial.service;

import java.util.List;

import com.boot.tutorial.dto.CustomerRequestDto;
import com.boot.tutorial.dto.CustomerResponseDto;

public interface CustomerService {

	public List<CustomerResponseDto> getAllCustomer();
	
	public CustomerResponseDto getCustomerByName(String name);
	
	public String addCustomer(CustomerRequestDto customerDto);
	
	public CustomerResponseDto updateCustomer(Integer id ,CustomerRequestDto customerDto);
	
	
	public String deleteCustomer(Integer id);
}
