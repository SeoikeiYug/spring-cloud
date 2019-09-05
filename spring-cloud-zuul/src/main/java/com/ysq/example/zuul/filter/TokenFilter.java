package com.ysq.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TokenFilter extends ZuulFilter {

	private final Logger LOGGER = LoggerFactory.getLogger(TokenFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		final RequestContext currentContext = RequestContext.getCurrentContext();
		final HttpServletRequest request = currentContext.getRequest();

		LOGGER.info("--->>> TokenFilter {}, {}", request.getMethod(), request.getRequestURL().toString());

		final String token = request.getParameter("token");

		if (StringUtils.isNotBlank(token)) {
			currentContext.setSendZuulResponse(true);
			currentContext.setResponseStatusCode(200);
			currentContext.set("isSuccess", true);
			return null;
		} else {
			currentContext.setSendZuulResponse(false);
			currentContext.setResponseStatusCode(400);
			currentContext.setResponseBody("token is empty");
			currentContext.set("isSuccess", false);
			return null;
		}
	}
}
