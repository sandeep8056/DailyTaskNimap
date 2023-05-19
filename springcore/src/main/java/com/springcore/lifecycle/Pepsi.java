package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//implementation of spring beant init and destroy service by using interface

public class Pepsi implements InitializingBean, DisposableBean {
	
	private int qty;
	private double price;
	
	
	
	
	
	public Pepsi(int qty, double price) {
		super();
		this.qty = qty;
		this.price = price;
	}
	
	public Pepsi() {
		super();
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "price "+getPrice()+" qty "+getQty();
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("init method of pepsic with interface");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destoy method using implementation");
	}
	
	
	

}
