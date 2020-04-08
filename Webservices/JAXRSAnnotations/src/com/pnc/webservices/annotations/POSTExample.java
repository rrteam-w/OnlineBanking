package com.pnc.webservices.annotations;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path(value="/sum")
public class POSTExample {
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public int sum(@FormParam("num1") int num1, @FormParam("num2") int num2){
		return num1+num2;
	}
}
