package com.boot.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.boot.tutorial.dto.PageRequestProductDto;
import com.boot.tutorial.modal.Product;
import com.boot.tutorial.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	

	public Page<Product> getAllProductUsingPagination(PageRequestProductDto dto){
		 
		Pageable pageable=null;
		if(dto != null) {
		 pageable = new PageRequestProductDto().getPageAble(dto);
		}
		return productRepository.findAll(pageable);
	}
	
	
	public String addProduct(Product product) {
		Product newProduct = new Product();
		newProduct.setName(product.getName());
		newProduct.setPrice(product.getPrice());
		newProduct.setQuantity(product.getQuantity());
		productRepository.save(newProduct);
		return "product added successfully";
	}
}
