package com.jardoapps.jraeb.blocking.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardoapps.jraeb.blocking.petstore.client.EmailClient;
import com.jardoapps.jraeb.blocking.petstore.dto.EmailDto;
import com.jardoapps.jraeb.blocking.petstore.dto.EmailSendingResultDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController("/api/debug")
public class DebugController {

	@Autowired
	private EmailClient emailClient;

	@GetMapping("/send-email")
	public void sendEmail() {
		EmailDto emailDto = new EmailDto("template_1", "john.doe@example.com");
		EmailSendingResultDto result = emailClient.sendEmail(emailDto);
		log.info("Email sending result: {}", result);
	}

}
