package com.jardoapps.jraeb.blocking.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BlockingPetStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockingPetStoreApplication.class, args);
	}

}
