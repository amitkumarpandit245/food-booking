package com.cts.food.food_booking;
public class DemoFoodBooking 
{
    public static void main( String[] args )
    {
    	FoodBookingDAO obj=new FoodBookingDAO();
    	obj.getAllRestaurant().forEach(System.out::println);
    	obj.filterRestaurantBasedOnRating().forEach(System.out::println);
    	obj.getAllRestaurantAvailability().forEach(System.out::println);
    }
}
