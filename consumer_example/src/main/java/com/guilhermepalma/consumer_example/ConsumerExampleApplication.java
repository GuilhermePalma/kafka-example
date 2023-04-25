package com.guilhermepalma.consumer_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka // Set Kafka in Spring Boot Project
public class ConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerExampleApplication.class, args);
	}

}
