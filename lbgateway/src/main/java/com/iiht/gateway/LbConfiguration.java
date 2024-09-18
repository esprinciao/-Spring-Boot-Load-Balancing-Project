package com.iiht.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LbConfiguration {
	
	

		@Bean public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
			return
					builder.routes().route(
							
							"lbservice",r->r.path("/test/**").uri("lb://LBSERVICE")
							).build();
		}

	}



