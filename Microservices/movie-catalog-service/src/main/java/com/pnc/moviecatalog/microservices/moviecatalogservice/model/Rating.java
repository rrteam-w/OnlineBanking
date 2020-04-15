package com.pnc.moviecatalog.microservices.moviecatalogservice.model;

public class Rating {

	private int rating;
	private Integer movieId;
	
	public Rating() {
	}
	
	public Rating(Integer movieId, int rating) {
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
}
