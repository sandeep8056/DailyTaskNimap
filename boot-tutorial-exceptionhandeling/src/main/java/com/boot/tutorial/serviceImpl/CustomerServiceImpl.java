package com.boot.tutorial.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.tutorial.dto.CustomerRequestDto;
import com.boot.tutorial.dto.CustomerResponseDto;
import com.boot.tutorial.entity.Customer;
import com.boot.tutorial.exception.CustomerNotFoundException;
import com.boot.tutorial.repo.CustomerRepo;
import com.boot.tutorial.service.CustomerService;
import com.boot.tutorial.utills.Converter;

@Service
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private Converter convert;

	@Override
	public List<CustomerResponseDto> getAllCustomer() {
		
		List<Customer> customers = customerRepo.findAll();
		
		List<CustomerResponseDto> customersDto =customers.stream().map(customer -> {
			return convert.EntityToCustomerDto(customer);
		}).collect(Collectors.toList());
		return customersDto;
	}

	@Override
	public CustomerResponseDto getCustomerByName(String name) {
		CustomerResponseDto customerDto =convert.EntityToCustomerDto(customerRepo.findByCustomerName(name));
		return customerDto;
	}

	@Override
	public String addCustomer(CustomerRequestDto customerDto) {
		Customer customer =convert.CustomerDtoToEntity(customerDto);
		customerRepo.save(customer);
		return "customer added successfully";
	}

	@Override
	public CustomerResponseDto updateCustomer(Integer id ,CustomerRequestDto customerDto) {
		
		 Optional<Customer> customerOpt = customerRepo.findById(id);
			if(customerOpt.isEmpty()) {
				throw new CustomerNotFoundException("No customer found by given id "+id);
			}
		
			Customer customer =customerOpt.get();
		 customer.setCustomerName(customerDto.getCustomerName());
		 customer.setMobileNo(customerDto.getMobileNo());
		 customer.setCustomerAddress(convert.addressDtoToAddress(customerDto.getCustomerAddress()));
		 customerRepo.save(customer);
		return convert.EntityToCustomerDto(customer);
	}

	@Override
	public String deleteCustomer(Integer id) {
		
		if(customerRepo.findById(id).isEmpty()) {
			throw new CustomerNotFoundException("no customer found by given id");
		}
		customerRepo.deleteById(id);
		return "customer deleted successfully";
	}
	


}
