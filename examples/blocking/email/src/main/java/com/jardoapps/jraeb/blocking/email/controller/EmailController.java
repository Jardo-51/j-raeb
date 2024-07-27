package com.jardoapps.jraeb.blocking.email.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jardoapps.jraeb.blocking.email.dto.EmailDto;
import com.jardoapps.jraeb.blocking.email.dto.EmailSendingResultDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmailController {

	@PostMapping(path = "/api/email/send")
	public EmailSendingResultDto sendEmail(@RequestBody EmailDto emailDto) {
		log.info("Sending email '{}'", emailDto);
		return EmailSendingResultDto.OK;
	}

}
