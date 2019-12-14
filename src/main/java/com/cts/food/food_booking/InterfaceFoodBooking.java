package com.cts.food.food_booking;

import java.util.List;

public interface InterfaceFoodBooking {

	public List<Restaurant> getAllRestaurant();
	public List<Restaurant> filterRestaurantBasedOnRating();
	public List<Restaurant> getAllRestaurantAvailability();
}
