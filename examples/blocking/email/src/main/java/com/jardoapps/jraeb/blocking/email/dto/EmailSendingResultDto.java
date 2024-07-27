package com.jardoapps.jraeb.blocking.email.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailSendingResultDto {

	public static final EmailSendingResultDto OK = new EmailSendingResultDto("OK");

	private String message;

}
