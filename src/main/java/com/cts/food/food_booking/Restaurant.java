package com.cts.food.food_booking;

import java.time.LocalTime;
import java.util.Arrays;

public class Restaurant {
	private int restaurantId;
	private String restaurantName;
	private double rating;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private String[] reviews;
	private String[] dishes;
	public Restaurant(int restaurantId, String restaurantName, double rating, LocalTime openingTime,
			LocalTime closingTime, String[] reviews, String[] dishes) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.reviews = reviews;
		this.dishes = dishes;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public LocalTime getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}
	public LocalTime getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	public String[] getReviews() {
		return reviews;
	}
	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}
	public String[] getDishes() {
		return dishes;
	}
	public void setDishes(String[] dishes) {
		this.dishes = dishes;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", rating=" + rating
				+ ", openingTime=" + openingTime + ", closingTime=" + closingTime + ", reviews="
				+ Arrays.toString(reviews) + ", dishes=" + Arrays.toString(dishes) + "]";
	}
	

}
