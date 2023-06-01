package com.boot.spring.jpa.utils;

import java.util.HashMap;
import java.util.Map;

import com.boot.spring.jpa.exception.InsufficientAmountException;

public class PaymentUtils {
	
	
	private static Map< String , Double> paymentMap = new HashMap<>();
	
	static {
		
		paymentMap.put("account1", 100.0);
		paymentMap.put("account2", 13000.0);
		paymentMap.put("account3", 20000.0);
		paymentMap.put("account4", 8000.0);
		
	}
	
	public static boolean validateCreditLimit(String accNo, double paidAmount) {
		 	if(paidAmount > paymentMap.get(accNo)) {
		 		throw new InsufficientAmountException("insufficient funds....");
		 	}else {
		 		return true;
		 	}
	}
 
}
