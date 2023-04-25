package com.guilhermepalma.producer_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka // Set Kafka in Spring Boot Project
public class ProducerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerExampleApplication.class, args);
    }

}
