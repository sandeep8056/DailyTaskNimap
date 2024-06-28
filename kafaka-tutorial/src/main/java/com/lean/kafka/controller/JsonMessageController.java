package com.lean.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lean.kafka.model.User;
import com.lean.kafka.producer.JsonKafkaProducer;

@RestController
public class JsonMessageController {

	
	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;
	
	
	@PostMapping("/publish")
	public ResponseEntity<?> publish(@RequestBody User user){
		
		jsonKafkaProducer.sendMessage(user);
		
		return ResponseEntity.ok("json message sent to kafka topic");
	}
	
}
