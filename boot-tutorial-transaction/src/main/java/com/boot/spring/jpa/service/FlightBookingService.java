package com.boot.spring.jpa.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.spring.jpa.dto.FlightBookingAcknowlegement;
import com.boot.spring.jpa.dto.FlightBookingRequest;
import com.boot.spring.jpa.entity.PassengerInfo;
import com.boot.spring.jpa.entity.PaymentInfo;
import com.boot.spring.jpa.repo.PassengerInfoReposiotry;
import com.boot.spring.jpa.repo.PaymentInfoRepository;
import com.boot.spring.jpa.utils.PaymentUtils;

@Service
public class FlightBookingService {
	
	@Autowired
	PaymentInfoRepository paymentInfoRepository;
	
	@Autowired
	PassengerInfoReposiotry passengerInfoReposiotry;
	
	
	public FlightBookingAcknowlegement bookFlightTicket(FlightBookingRequest request) {
		
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		
		passengerInfoReposiotry.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), paymentInfo.getAmount());
		
		paymentInfo.setPassengerId(passengerInfo.getpId());
		paymentInfo.setAmount(passengerInfo.getFare());
		
		paymentInfoRepository.save(paymentInfo);
		
		return new FlightBookingAcknowlegement("success",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}
	

}
