package com.cts.food.food_booking;

import java.util.Arrays;

public class Review {
	private int reviewId;
	private String[] reviews;
	public Review(int reviewId, String[] reviews) {
		super();
		this.reviewId = reviewId;
		this.reviews = reviews;
	}
	public String[] getReviews() {
		return reviews;
	}
	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviews=" + Arrays.toString(reviews) + "]";
	}

}
