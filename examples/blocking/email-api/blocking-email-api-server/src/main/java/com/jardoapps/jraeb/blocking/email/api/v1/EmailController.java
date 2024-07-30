package com.jardoapps.jraeb.blocking.email.api.v1;

import org.springframework.web.bind.annotation.RestController;

import com.jardoapps.jraeb.blocking.email.api.v1.dto.EmailDto;
import com.jardoapps.jraeb.blocking.email.api.v1.dto.EmailSendingResultDto;

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
