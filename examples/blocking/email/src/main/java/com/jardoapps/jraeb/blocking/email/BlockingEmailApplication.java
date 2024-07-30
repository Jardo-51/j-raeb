package com.jardoapps.jraeb.blocking.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jardoapps.jraeb.blocking.email.api.v1.EmailController;

@SpringBootApplication
@ComponentScan(basePackageClasses = {
		EmailController.class,
})
public class BlockingEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockingEmailApplication.class, args);
	}

}
