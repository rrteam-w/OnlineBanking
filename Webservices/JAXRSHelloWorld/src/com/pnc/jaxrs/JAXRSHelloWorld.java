package com.pnc.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value="/hello")
public class JAXRSHelloWorld {
	@GET
	public String sayHello(){
		return "Hello World...";
	}
}
