package com.pnc.ratinginfo.microservices.ratinginfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.ratinginfo.microservices.ratinginfoservice.model.Rating;
import com.pnc.ratinginfo.microservices.ratinginfoservice.model.UserRatings;

@RestController
@RequestMapping(value="/rating")
public class RatingInfoController {
	
	@RequestMapping(value="/{movieId}")
	public Rating getMovieRating(String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping(value="/users/{userId}")
	public UserRatings getRatingsInfo(@PathVariable("userId") String userId){
		UserRatings userRating = new UserRatings();
		userRating.initData(userId);
		return userRating;
	}
}
