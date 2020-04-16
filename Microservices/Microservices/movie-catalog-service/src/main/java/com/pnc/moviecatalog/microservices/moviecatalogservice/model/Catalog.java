package com.pnc.moviecatalog.microservices.moviecatalogservice.model;

public class Catalog {
	
	private String name;
	private String overview;
	private int rating;
	
	public Catalog() {
	}
	
	public Catalog(String name, String overview, int rating) {
		super();
		this.name = name;
		this.overview = overview;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
