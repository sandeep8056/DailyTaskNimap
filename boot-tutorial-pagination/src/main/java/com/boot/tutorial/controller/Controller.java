package com.boot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.dto.PageRequestProductDto;
import com.boot.tutorial.modal.Product;
import com.boot.tutorial.service.ProductService;

@RestController
public class Controller {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/products")
	public ResponseEntity<?> GetProductUsingPageSize(@RequestBody PageRequestProductDto dto){		
		return new  ResponseEntity<>(productService.getAllProductUsingPagination(dto),HttpStatus.OK);	
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody Product product){
		return new ResponseEntity<>(productService.addProduct(product),HttpStatus.OK);
	}

}
