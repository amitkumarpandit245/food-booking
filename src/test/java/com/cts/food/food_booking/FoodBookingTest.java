package com.cts.food.food_booking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodBookingTest {
	Logger logger=LoggerFactory.getLogger(FoodBookingTest.class);
	@Mock
	Restaurant rest;
	@Mock
	Review review;
	@Mock
	Dishes dish;
	@Mock
	Utility utility;
	@InjectMocks
	FoodBookingDAO foodBooking;
	@Before
	public void setUp() throws Exception {
		logger.info("Before All Test Case");
	}

	@After
	public void tearDown() throws Exception {
		logger.info("After All Test Case");
	}

	@Test
	public void testGetAllRestaurant() {
		assertEquals(foodBooking.getAllRestaurant(), foodBooking.getAllRestaurant());
	}
	@Test
	public void testFilterRestaurantBasedOnRating() {
		assertEquals(foodBooking.filterRestaurantBasedOnRating(), foodBooking.filterRestaurantBasedOnRating());
	}
	@Test
	public void testGetAllRestaurantAvailability() {
		assertEquals(foodBooking.getAllRestaurantAvailability(), foodBooking.getAllRestaurantAvailability());
	}
	@Test
	public void testGetAllRestaurantAvailabilitys() {
		assertEquals(8, 4+4);
	}


}
