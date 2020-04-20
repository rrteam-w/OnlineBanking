package com.pnc.ratinginfo.microservices.ratinginfoservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRatings {

	private List<Rating> userRatings;
	private String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}
	
	public void initData(String userId) {
		this.setUserId(userId);
		this.setUserRatings(Arrays.asList(
				new Rating("100", 4),
				new Rating("500", 3)));
	}
	
}
