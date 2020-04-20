package com.pnc.movieinfo.microservices.moviesinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pnc.movieinfo.microservices.moviesinfoservice.model.MovieSummary;

@RestController
@RequestMapping(value="/moviedb")
public class MovieInfoController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apikey;
	
	@RequestMapping(value="/{movieId}")
	public MovieSummary getMovieSummary(@PathVariable("movieId") String movieId) {
		MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apikey, MovieSummary.class); 
		return new MovieSummary(movieSummary.getOriginal_title(), movieSummary.getOverview(), movieSummary.getStatus());
	}
}
