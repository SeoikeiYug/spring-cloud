package com.ysq.example.hystrixdashboard.factory;

import com.ysq.example.hystrixdashboard.service.IndexClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<IndexClientService> {
	@Override
	public IndexClientService create(Throwable throwable) {
		return () -> "feign + hystrix, 提供者服务宕机";
	}
}
