package com.boot.tutorial.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boot.tutorial.entity.Customer;

public interface CustomerRepo  extends JpaRepository<Customer, Integer>{
	
	
	@Query(value="from Customer  where customerName = :name ")
	public Customer findByCustomerName(@Param("name") String customerName);

}
