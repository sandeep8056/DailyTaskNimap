package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentAddress")
public class Address {

	
	
	@Value("${address.city}")
	private String city;
	
	@Value("${address.pincode}")
	private int pinCode;
	
	@Value("${address.state}")
	private String State;

	public Address() {
		super();
			}

	public Address(String city, int pinCode, String state) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
