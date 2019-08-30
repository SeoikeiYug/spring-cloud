package com.ysq.example.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * description: 指定这个接口调用的服务的提供名称"eureka-provider"
 */

@FeignClient("eureka-provider")
public interface IndexClientService {

	@GetMapping("/")
	String consumer();

}
