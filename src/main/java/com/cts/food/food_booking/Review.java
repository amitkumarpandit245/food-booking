package com.cts.food.food_booking;

import java.util.Arrays;

public class Review {
	private int reviewId;
	String review;
	private String[] reviews;


	public Review(int reviewId, String review) {
		super();
		this.reviewId = reviewId;
		this.review = review;
	}

	public String getReview() {
		return review;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String[] getReviews() {
		return reviews;
	}
	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", review=" + review + "]";
	}




}
