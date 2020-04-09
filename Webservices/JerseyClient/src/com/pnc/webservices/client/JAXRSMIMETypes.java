package com.pnc.webservices.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/mimetype")
public class JAXRSMIMETypes {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello1(){
		return "<html><body><h1> Welcome to Jersey Client Text HTML...</h1></body></html>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String sayHello2(){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<text> Welcome to Jersey Client Application XML...</text></xml>";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello3(){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<text> Welcome to Jersey Client Text XML...</text></xml>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello4(){
		return "Welcome to Jersey Client Palin Text...";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello5(){
		return "{\"message\":\"Welcome to Jersey Client Application JSON...\"}";
	}
}
