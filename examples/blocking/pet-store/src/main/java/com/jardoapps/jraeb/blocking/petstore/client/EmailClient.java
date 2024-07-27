package com.jardoapps.jraeb.blocking.petstore.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jardoapps.jraeb.blocking.petstore.dto.EmailDto;
import com.jardoapps.jraeb.blocking.petstore.dto.EmailSendingResultDto;

@FeignClient(name = "emailClient", url = "${integration.email.url}")
public interface EmailClient {

	@PostMapping(path = "/api/email/send")
	EmailSendingResultDto sendEmail(@RequestBody EmailDto emailDto);

}
