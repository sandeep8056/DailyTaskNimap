package com.boot.tutorial.utills;

import org.springframework.stereotype.Component;

import com.boot.tutorial.dto.AddressDto;
import com.boot.tutorial.dto.CustomerRequestDto;
import com.boot.tutorial.dto.CustomerResponseDto;
import com.boot.tutorial.entity.Address;
import com.boot.tutorial.entity.Customer;

@Component
public class Converter {

	public CustomerResponseDto EntityToCustomerDto(Customer customer) {

		CustomerResponseDto customerDto = new CustomerResponseDto();

		customerDto.setCustomerName(customer.getCustomerName());
		customerDto.setMobileNo(customer.getMobileNo());
		Address address = customer.getCustomerAddress();
		AddressDto addressDto = entityTOAddressDto(address);
		customerDto.setCustomerAddress(addressDto);
		return customerDto;
	}

	public AddressDto entityTOAddressDto(Address address) {

		AddressDto addressDto = new AddressDto();

		addressDto.setFlat(address.getFlat());
		addressDto.setCity(address.getCity());
		addressDto.setLandmark(address.getLandmark());
		addressDto.setPinCode(address.getPinCode());
		addressDto.setStreetName(address.getStreetName());
		return addressDto;
	}

	public Address addressDtoToAddress(AddressDto addressDto) {

		Address address = new Address();

		address.setFlat(addressDto.getFlat());
		address.setCity(addressDto.getCity());
		address.setLandmark(addressDto.getLandmark());
		address.setPinCode(addressDto.getPinCode());
		address.setStreetName(addressDto.getStreetName());
		return address;
	}

	public Customer CustomerDtoToEntity(CustomerRequestDto customerDto) {

		Customer customer = new Customer();
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setMobileNo(customerDto.getMobileNo());
		Address address= addressDtoToAddress(customerDto.getCustomerAddress());
		customer.setCustomerAddress(address);
		return customer;
	}

}
