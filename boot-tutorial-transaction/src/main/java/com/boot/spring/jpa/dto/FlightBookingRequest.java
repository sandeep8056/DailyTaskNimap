package com.boot.spring.jpa.dto;

import com.boot.spring.jpa.entity.PassengerInfo;
import com.boot.spring.jpa.entity.PaymentInfo;

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
public class FlightBookingRequest {
	
	private PassengerInfo passengerInfo;
	
	private PaymentInfo  paymentInfo;

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
	
	

}
