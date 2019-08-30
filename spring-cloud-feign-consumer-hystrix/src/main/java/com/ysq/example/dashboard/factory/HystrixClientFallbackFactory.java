package com.ysq.example.dashboard.factory;

import com.ysq.example.dashboard.service.IndexClientService;
import feign.hystrix.FallbackFactory;

public class HystrixClientFallbackFactory implements FallbackFactory<IndexClientService> {
	@Override
	public IndexClientService create(Throwable throwable) {
		return () -> "feign + hystrix, 提供者服务宕机";
	}
}
