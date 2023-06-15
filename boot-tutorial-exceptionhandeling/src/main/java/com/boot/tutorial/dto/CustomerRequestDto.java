package com.boot.tutorial.dto;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDto {

	@NotEmpty(message = "name field cannot be empty or null")
	private String customerName;

	@NotEmpty(message = "mobile number field cannot be empty")
	private String mobileNo;

	@Valid
	private AddressDto customerAddress;

}
