package com.pnc.moviecatalog.microservices.moviecatalogservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.MovieSummary;

@Service
public class MovieSummaryInfo {
	
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="getMovieSummaryFallback")
	public MovieSummary getMovieSummary(String movieId) {
		MovieSummary movieSummary = restTemplate.getForObject("http://movies-info-service/moviedb/"+movieId, MovieSummary.class);
		return movieSummary;
	}
	
	public MovieSummary getMovieSummaryFallback(String movieId) {
		MovieSummary movieSummary = new MovieSummary();
		movieSummary.setOriginal_title("No Movie Title");
		movieSummary.setOverview("");
		movieSummary.setStatus("");
		return movieSummary;
	}
}
