package com.pnc.movieinfo.microservices.moviesinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.movieinfo.microservices.moviesinfoservice.model.Movie;

@RestController
@RequestMapping(value="/movie")
public class MovieInfoController {

	@RequestMapping(value="/{movieId}")
	public Movie getMovieOverview(@PathVariable("movieId") int movieId) {
		return new Movie(movieId, "Bahubali","Blockbuster");
	}
}
