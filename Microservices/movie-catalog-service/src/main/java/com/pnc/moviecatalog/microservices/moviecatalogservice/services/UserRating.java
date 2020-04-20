package com.pnc.moviecatalog.microservices.moviecatalogservice.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.Rating;
import com.pnc.moviecatalog.microservices.moviecatalogservice.model.UserRatings;

@Service
public class UserRating {
	
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="getUserRatingFallback")
	public UserRatings getUserRatings(String userId) {
		UserRatings userRating = restTemplate.getForObject("http://rating-info-service/rating/users/"+userId, UserRatings.class);
		return userRating;
	}
	
	public UserRatings getUserRatingFallback(String userId) {
		UserRatings userRating = new UserRatings();
		userRating.setUserId("foo");
		userRating.setUserRatings(Arrays.asList(
				new Rating("no movieId",0)));
		return userRating;
	}
}
