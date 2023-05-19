package com.springcore.lifecycle;

public class Car {

	
	private String model;
	private String colour;
	private String price;
	
	public Car() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		System.out.println(" model : after this init is going to invoke setColor");
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		
		System.out.println(" Color : after this init is going to invoke setPrice");
		this.colour = colour;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println(" price : after this init is going to invoke");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", colour=" + colour + ", price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("hello there this init method");
	}

	
	public void destroy() {
		System.out.println("this is going to detroy the bean after completion of destroy method");
	}
	



}

