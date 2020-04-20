package com.pnc.ratinginfo.microservices.ratinginfoservice.model;

public class Rating {

	private int rating;
	private String movieId;
	
	public Rating() {
	}
	
	public Rating(String movieId, int rating) {
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
}
