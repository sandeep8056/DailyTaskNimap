package com.boot.tutorial.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class AddressDto {

	private String flat;

	@NotNull(message = "streetname field cannot be null value")
	private String streetName;

	@NotBlank(message = "landmark field cannot be blank")
	private String landmark;

	private String city;

	@NotNull(message = "pincode must be required field")
	@Min(value=5,message = "minimum 5  digit required")
	private Integer pinCode;

}
