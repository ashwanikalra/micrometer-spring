package com.example.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrometerToPrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrometerToPrometheusApplication.class, args);
	}

}
