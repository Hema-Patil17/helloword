package com.springBoot.helloword.Route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Pain009route extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("file:///home/user/Downloads/Inbox").routeId("one")
		.to("file:///home/user/Downloads/OUT");
		
	}

}
