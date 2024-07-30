package com.jardoapps.jraeb.blocking.email.api.v1;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "emailClient", url = "${integration.email.url}")
public interface EmailClient extends EmailApi {

}
