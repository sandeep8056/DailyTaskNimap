package com.boot.tutorial.dto;

public class ProductDto {
	

	private Integer productId;
	
	private String productName;
	
	private Integer productQuantity;
	
	

	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ProductDto(Integer productId, String productName, Integer productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}



	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	

}
