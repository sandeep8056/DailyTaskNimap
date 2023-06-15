package com.boot.tutorial.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
	
	private String flat;
	
	private String streetName;
	
	private String landmark;
	
	private String city;
	
	private Integer pinCode;

}
