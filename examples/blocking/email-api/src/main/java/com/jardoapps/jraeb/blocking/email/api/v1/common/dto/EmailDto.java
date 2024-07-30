package com.jardoapps.jraeb.blocking.email.api.v1.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto {

	private String templateId;

	private String receiverAddress;

}
