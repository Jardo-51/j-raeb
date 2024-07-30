package com.jardoapps.jraeb.blocking.email.api.v1.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.jardoapps.jraeb.blocking.email.api.v1.common.EmailApi;

@FeignClient(name = "emailClient", url = "${integration.email.url}")
public interface EmailClient extends EmailApi {

}
