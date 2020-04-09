package com.pnc.webservices.jaxb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/dictionary")
public class DictionaryController {
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Dictionary getDetails(){
		Dictionary dictionary = new Dictionary();
		dictionary.setBookName("Java");
		dictionary.setBookDesc("Introduced by JamesGosling...");
		return dictionary;
	}
}
