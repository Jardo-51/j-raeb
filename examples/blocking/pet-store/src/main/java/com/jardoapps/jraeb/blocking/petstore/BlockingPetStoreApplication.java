package com.jardoapps.jraeb.blocking.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.jardoapps.jraeb.blocking.email.api.v1.client.EmailClient;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = {
		EmailClient.class,
})
public class BlockingPetStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockingPetStoreApplication.class, args);
	}

}
