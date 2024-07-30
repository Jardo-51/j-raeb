package com.jardoapps.jraeb.blocking.email.api.v1.server;

import org.springframework.web.bind.annotation.RestController;

import com.jardoapps.jraeb.blocking.email.api.v1.common.EmailApi;
import com.jardoapps.jraeb.blocking.email.api.v1.common.dto.EmailDto;
import com.jardoapps.jraeb.blocking.email.api.v1.common.dto.EmailSendingResultDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmailController implements EmailApi {

	@Override
	public EmailSendingResultDto sendEmail(EmailDto emailDto) {
		log.info("Sending email '{}'", emailDto);
		return EmailSendingResultDto.OK;
	}

}
