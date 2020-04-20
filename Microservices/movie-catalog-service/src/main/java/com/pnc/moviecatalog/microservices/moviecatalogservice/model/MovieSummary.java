package com.pnc.moviecatalog.microservices.moviecatalogservice.model;

public class MovieSummary {
	
	private String original_title;
	private String overview;
	private String status;
	
	public MovieSummary() {
		
	}
	
	public MovieSummary(String original_title, String overview, String status) {
		this.original_title = original_title;
		this.overview = overview;
		this.status = status;
	}

	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
