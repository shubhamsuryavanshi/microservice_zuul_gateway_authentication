package com.microimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroImageApplication.class, args);
	}

}
