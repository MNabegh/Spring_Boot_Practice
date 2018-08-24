package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SpringConsumingKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumingKafkaApplication.class, args);
	}
	
	@KafkaListener(topics = "test", groupId = "group-id")
	public void listen(String message) {
	   System.out.println("Received Messasge in group - group-id: " + message);
	}
}
