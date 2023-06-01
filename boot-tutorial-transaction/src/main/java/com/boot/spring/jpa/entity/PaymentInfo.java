package com.boot.spring.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="payment_info")
public class PaymentInfo {
	
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
	private String paymentId;
	
	private String accountNo;
	
	private double amount;
	 
	private String cardType;
	
	private Long passengerId;

	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentInfo(String paymentId, String accountNo, double amount, String cardType, Long passengerId) {
		super();
		this.paymentId = paymentId;
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passengerId = passengerId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}
	
	

}
