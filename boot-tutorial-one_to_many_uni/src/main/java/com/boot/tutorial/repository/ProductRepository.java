package com.boot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.tutorial.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
