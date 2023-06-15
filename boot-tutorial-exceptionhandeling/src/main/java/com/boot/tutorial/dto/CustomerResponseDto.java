package com.boot.tutorial.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {

	private String customerName;

	private String MobileNo;

	private AddressDto customerAddress;
}
