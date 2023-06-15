package com.boot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.dto.CategoryDto;
import com.boot.tutorial.dto.ProductDto;
import com.boot.tutorial.service.CategoryService;
import com.boot.tutorial.serviceImpl.CategoryServiceImpl;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryServiceImpl categoryService;
	
	
	@PostMapping("/Categories")
	public ResponseEntity<?> addCategory(@RequestBody CategoryDto categoryDto ){
		try {
		return new  ResponseEntity<CategoryDto>(categoryService.addCategory(categoryDto),HttpStatus.OK);
		}catch (Exception e) {
			return   ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	
	@PostMapping("/categories/products")
	public ResponseEntity<?> addProductToExistingCategory(@RequestParam("category") String category,
			@RequestBody ProductDto productDto) throws Exception{
		try {
		return new ResponseEntity<>(categoryService.addProductToExistingCategory(category, productDto),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/category")
	public ResponseEntity<?> getByCategory(@RequestParam("category") String category){
		try {
			return new ResponseEntity<>(categoryService.getByCategory(category),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);		
			}
		
	}
	
	
	@DeleteMapping("/categories/{categoryName}")
	public ResponseEntity<?> deleteByCategoryName(@PathVariable("categoryName") String categoryName){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(categoryService.deleteCategoryByName(categoryName));
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		
	}
}
