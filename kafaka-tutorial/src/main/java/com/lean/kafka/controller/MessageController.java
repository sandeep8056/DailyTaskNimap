package com.lean.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lean.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	private KafkaProducer kafkaProducer;

	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@GetMapping("/publish")
	public ResponseEntity<?> publishMessage(@RequestParam("message") String message) {

		
		kafkaProducer.sendMessage(message);
		
		
		return ResponseEntity.ok("Message sent to kafka-topic");
	}
}
