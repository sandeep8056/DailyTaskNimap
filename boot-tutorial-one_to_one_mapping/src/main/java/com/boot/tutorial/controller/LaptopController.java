package com.boot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.Service.LaptopService;
import com.boot.tutorial.modal.Laptop;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;

	@GetMapping("/laptops/")
	public ResponseEntity<?> getAllStudent() {
		try {
			return new ResponseEntity<>(laptopService.getAllLaptop(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping("/laptops/")
	public ResponseEntity<?> addLaptop(@RequestBody Laptop laptop) {

		try {
			return new ResponseEntity<>(laptopService.addLaptop(laptop), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
	
	@PutMapping("/laptops/")
	public ResponseEntity<?> updateLaptop(@RequestParam("id") Integer id,@RequestBody Laptop laptop){
		try {
			return new ResponseEntity<>(laptopService.updateLaptop(id, laptop),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);	
			}	
	}
	
	@DeleteMapping("/laptops/")
	public ResponseEntity<?> deleteUser(@RequestParam Integer id){
		try {
			return new ResponseEntity<>(laptopService.deleteLaptop(id),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}



}
