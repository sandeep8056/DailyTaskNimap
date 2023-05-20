package com.boot.tutorial.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.tutorial.modal.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	Page<Product> findAllByQuantity(String quantity,Pageable pageable);

}
