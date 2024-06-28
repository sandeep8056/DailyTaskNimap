package com.lean.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.lean.kafka.model.User;

@Service
public class JsonKafkaProducer {

	
	private static final Logger logger = LoggerFactory.getLogger(JsonKafkaProducer.class);
			
			
	private KafkaTemplate<String, User> jsonKafkaTemplate;


	public JsonKafkaProducer(KafkaTemplate<String, User> jsonKafkaTemplate) {
		this.jsonKafkaTemplate=jsonKafkaTemplate;
	}
	
	
	public void sendMessage(User data) {
		
		logger.info(String.format("message sent ->  %s", data.toString()));
		
		Message<User> message = MessageBuilder
								.withPayload(data)
								.setHeader(KafkaHeaders.TOPIC, "javaguides")
								.build();
		
		jsonKafkaTemplate.send(message);
	}
	
}
