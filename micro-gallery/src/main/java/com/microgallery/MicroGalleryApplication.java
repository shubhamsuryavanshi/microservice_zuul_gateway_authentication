package com.microgallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroGalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroGalleryApplication.class, args);
	}

}
