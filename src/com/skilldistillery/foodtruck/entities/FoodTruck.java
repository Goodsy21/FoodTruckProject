package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private static int nextTruckId;
	private int id;
	private String foodType;
	private Double rating;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String toString() {
	    String output = "Truck #" + id + "\nTruck name= " + name + "\nFood type= " + foodType + "\nRating= " + rating;
	    return output;
	
}
}