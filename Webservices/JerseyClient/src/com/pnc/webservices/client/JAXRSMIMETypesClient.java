package com.pnc.webservices.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class JAXRSMIMETypesClient {

	private static URI getURIBuilder(){
		return UriBuilder.fromPath("http://localhost:8080/JerseyClient").build();
	}
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getURIBuilder());
		
		System.out.println(target.path("rest").path("mimetype").request().get(Response.class));
		System.out.println(target.path("rest").path("mimetype").request().accept(MediaType.TEXT_HTML).get(String.class));
		System.out.println(target.path("rest").path("mimetype").request().accept(MediaType.APPLICATION_XML).get(String.class));
		System.out.println(target.path("rest").path("mimetype").request().accept(MediaType.TEXT_XML).get(String.class));
		System.out.println(target.path("rest").path("mimetype").request().accept(MediaType.TEXT_PLAIN).get(String.class));
		System.out.println(target.path("rest").path("mimetype").request().accept(MediaType.APPLICATION_JSON).get(String.class));
	}

}
