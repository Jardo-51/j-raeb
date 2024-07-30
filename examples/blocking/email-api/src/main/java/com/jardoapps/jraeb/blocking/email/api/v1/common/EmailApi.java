package com.jardoapps.jraeb.blocking.email.api.v1.common;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jardoapps.jraeb.blocking.email.api.v1.common.dto.EmailDto;
import com.jardoapps.jraeb.blocking.email.api.v1.common.dto.EmailSendingResultDto;

public interface EmailApi {

	@PostMapping(path = "/api/email/send")
	EmailSendingResultDto sendEmail(@RequestBody EmailDto emailDto);

}
