package com.lean.kafka.producer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private Logger logger =LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate=kafkaTemplate;
	}
	
		
	public void sendMessage(String message) {
	
		logger.info(String.format("Message sent %s", message));
	
		for(int i =0;i<2000;i++) {
		   kafkaTemplate.send("javaguides",message+i);
		}
	}
}
