package com.boot.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.spring.jpa.dto.FlightBookingAcknowlegement;
import com.boot.spring.jpa.dto.FlightBookingRequest;
import com.boot.spring.jpa.service.FlightBookingService;

@RestController
public class FlightBookingController {

	
	
	@Autowired
	private FlightBookingService bookingService;
	
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowlegement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return bookingService.bookFlightTicket(request);
	}
}
