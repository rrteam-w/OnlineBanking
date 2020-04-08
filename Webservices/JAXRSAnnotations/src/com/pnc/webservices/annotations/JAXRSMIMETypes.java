package com.pnc.webservices.annotations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/mime")
public class JAXRSMIMETypes {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello1(){
		return "<html> <body> <h1> Welcome to JAX-RS HTML </h1> </body> </html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello2(){
		return "Welcome to JAX-RS Plain Text";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String sayHello3(){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <name> Application XML </name> </xml>";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello4(){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <name> Text XML </name> </xml>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello5(){
		return "{ \"message\": \"Welcome to JAX-RS JSON\"}";
	}
	
}
