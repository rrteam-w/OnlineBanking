package com.pnc.webservices.annotations;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path(value="/form")
public class JAXRSAnnotations {
	
	@GET
	@Path(value="/query")
	public int sum(@QueryParam("num1") int num1, @QueryParam("num2") int num2){
		return num1+num2;
	}
	
	@GET
	@Path(value="/matrix")
	public int multiply(@MatrixParam("num1") int num1, @MatrixParam("num2") int num2){
		return num1*num2;
	}
	
	@GET
	@Path(value="/path/{num1}/{num2}")
	public int subtract(@PathParam("num1") int num1, @PathParam("num2") int num2){
		return num1 - num2;
	}
}
