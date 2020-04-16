package com.pnc.ratinginfo.microservices.ratinginfoservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRatings {

	private List<Rating> userRatings;
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}
	
	public void initData(Integer userId) {
		this.setUserId(userId);
		this.setUserRatings(Arrays.asList(
				new Rating(1234, 4),
				new Rating(5678, 3)));
	}
	
}
