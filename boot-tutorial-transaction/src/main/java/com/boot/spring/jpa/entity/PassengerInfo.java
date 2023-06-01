package com.boot.spring.jpa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="passenger_info")
public class PassengerInfo {
	
	@Id
	@GeneratedValue
	private Long pId;
	
	private String name;
	
	private String email;
	
	private String source;
	
	private String destination;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date date_of_arrival;
	
	
	
	private double fare;

	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerInfo(Long pId, String name, String email, String source, String destination, Date date_of_arrival,
			 double fare) {
		super();
		this.pId = pId;
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.date_of_arrival = date_of_arrival;
		
		this.fare = fare;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate_of_arrival() {
		return date_of_arrival;
	}

	public void setDate_of_arrival(Date date_of_arrival) {
		this.date_of_arrival = date_of_arrival;
	}

	
	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
	
	

}
