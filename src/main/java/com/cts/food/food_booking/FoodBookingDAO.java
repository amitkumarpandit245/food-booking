package com.cts.food.food_booking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoodBookingDAO implements InterfaceFoodBooking{
	//Restaurant restaurant;
	public List<Review> getReview(int restaurantID) {
		List<Review> fileData=new ArrayList<>();
		try {
				fileData=Files.lines(Paths.get("src\\data\\Review.txt")).map(Utility::getReview).collect(Collectors.toList()).stream().filter(f->f.getReviewId()==restaurantID).collect(Collectors.toList());
				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return fileData;
	}
	public List<Dishes> getDishes(int restaurantID) {
		List<Dishes> fileData=new ArrayList<>();
		try {
				fileData=Files.lines(Paths.get("src\\data\\Dishes.txt")).map(Utility::getDishes).collect(Collectors.toList()).stream().filter(f->f.getRestaurantId()==restaurantID).collect(Collectors.toList());
				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return fileData;
	}
	public List<Restaurant> getAllRestaurant() {
		List<Restaurant> fileData=new ArrayList<>();
		try {
				fileData=Files.lines(Paths.get("src\\data\\Restaurant.txt")).map(Utility::getRestaurant).collect(Collectors.toList());
				//Files.lines(Paths.get("src\\data\\Restaurant.txt")).map(Utility::getRestaurant).forEach(r-> {r.setDishes(getDishes(r.getRestaurantId()));r.setReviews(getReview(r.getRestaurantId()));});
				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return fileData;
	}

	public List<Restaurant> filterRestaurantBasedOnRating() {
		List<Restaurant> fileData=new ArrayList<>();
		try {
				fileData=Files.lines(Paths.get("src\\data\\Restaurant.txt")).map(Utility::getRestaurant).collect(Collectors.toList()).stream().filter(r->r.getRating()<4).collect(Collectors.toList());
				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return fileData;
	}

	public List<Restaurant> getAllRestaurantAvailability() {
		List<Restaurant> fileData=new ArrayList<>();
		try {
				fileData=Files.lines(Paths.get("src\\data\\Restaurant.txt")).map(Utility::getRestaurant).collect(Collectors.toList()).stream().filter(r->r.getOpeningTime().isBefore(LocalTime.now()) && r.getClosingTime().isAfter(LocalTime.now())).collect(Collectors.toList());
				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return fileData;
	}

}
