package com.boot.tutorial.dto;

import java.util.List;

public class CategoryDto {

	private String categoryName;

	private List<ProductDto> products;
	
    
	

	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		

	public CategoryDto(String categoryName, List<ProductDto> products) {
		super();
		this.categoryName = categoryName;
		this.products = products;
	}




	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ProductDto> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}

}
