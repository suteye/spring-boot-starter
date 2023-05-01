package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ReceivedcustomerpoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceivedcustomerpoApplication.class, args);
	}

}
