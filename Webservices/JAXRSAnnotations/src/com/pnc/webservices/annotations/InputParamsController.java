package com.pnc.webservices.annotations;


import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value="/input")
public class InputParamsController {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String queryParam(@QueryParam("num1") int num1, @QueryParam("num2") int num2){
		int sum = num1+num2;
		return String.valueOf(sum);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String matrixParam(@MatrixParam("num1") int num1, @MatrixParam("num2") int num2){
		int sum = num1+num2;
		return String.valueOf(sum);
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path(value="{num1}/{num2}")
	public String pathParam(@PathParam("num1") int num1, @PathParam("num2") int num2){
		int sum = num1+num2;
		return String.valueOf(sum);
	}
}
