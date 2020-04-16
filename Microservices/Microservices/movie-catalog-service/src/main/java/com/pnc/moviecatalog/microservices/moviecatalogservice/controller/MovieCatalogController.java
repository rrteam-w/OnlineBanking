package com.pnc.moviecatalog.microservices.moviecatalogservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pnc.moviecatalog.microservices.moviecatalogservice.model.Catalog;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.Movie;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.UserRatings;

@RestController
@RequestMapping(value="/catalog")
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/{userId}")
	public List<Catalog> getCatalog(@PathVariable("userId") int userId){
		List<Catalog> catalogs;
		
		//Make a call rating-info-service
		UserRatings ratings = restTemplate.getForObject("http://rating-info-service/rating/users/"+userId, UserRatings.class);
		int movieId = ratings.getUserRatings().get(0).getMovieId();
		
		//Make a call to movies-info-service
		Movie movie = restTemplate.getForObject("http://movies-info-service/movie/"+movieId, Movie.class);
		
		catalogs = new ArrayList<Catalog>();
		catalogs.add(new Catalog(movie.getName(), movie.getOverview(), ratings.getUserRatings().get(0).getRating()));
		
		return catalogs;
	}
}