package com.boot.tutorial.service;

import java.util.List;

import com.boot.tutorial.dto.CategoryDto;
import com.boot.tutorial.dto.ProductDto;

public interface CategoryService {

	public List<CategoryDto> getAllCategory();
	
	public CategoryDto addCategory(CategoryDto categoryDto);
	
	public String addProductToExistingCategory(String category, ProductDto productDto) throws Exception;
}
