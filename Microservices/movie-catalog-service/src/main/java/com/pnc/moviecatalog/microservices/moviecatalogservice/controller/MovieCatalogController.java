package com.pnc.moviecatalog.microservices.moviecatalogservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pnc.moviecatalog.microservices.moviecatalogservice.model.Catalog;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.MovieSummary;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.UserRatings;
import com.pnc.moviecatalog.microservices.moviecatalogservice.services.MovieSummaryInfo;
import com.pnc.moviecatalog.microservices.moviecatalogservice.services.UserRating;

@RestController
@RequestMapping(value="/catalog")
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	MovieSummaryInfo movieSummaryInfo;
	
	@Autowired
	UserRating userRating;
	
	@RequestMapping(value="/{userId}")
	public List<Catalog> getCatalog(@PathVariable("userId") String userId){
		List<Catalog> catalogs;
		
		//Make a call to rating-info-service to get the list of movie ratings...
		UserRatings ratings = userRating.getUserRatings(userId);
		String movieId = ratings.getUserRatings().get(0).getMovieId();
		
		//Make a call to external service i.e. moviedb to fetch the real time movie information...
		MovieSummary movieSummary = movieSummaryInfo.getMovieSummary(movieId);
		
		catalogs = new ArrayList<Catalog>();
		catalogs.add(new Catalog(movieSummary.getOriginal_title(), movieSummary.getOverview(), ratings.getUserRatings().get(0).getRating()));
		
		return catalogs;
	}
	
}