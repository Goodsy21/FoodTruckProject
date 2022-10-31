package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck[] trucks = new FoodTruck[5];
		for (int i = 0; i < trucks.length; i++) {

			FoodTruck truck = new FoodTruck();
			System.out.println("What is the name of the food truck you recently visited? or type \"Quit\" to quit.");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Quit")) {
				break;
			}
			truck.setName(response);
			System.out.println("What kind of food do they serve?");
			truck.setFoodType(sc.nextLine());
			System.out.println("On a scale from one to 5, how would you rate the food?");
			truck.setRating(sc.nextDouble());
			sc.nextLine();
			truck.setId(i);
			trucks[i] = truck;
		}
		FoodTruck highestRatedTruck = new FoodTruck();
		highestRatedTruck.setRating(0.0);
		Double totalRatings = 0.0;
		Double averageRating = 0.0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				if (trucks[i].getRating() > highestRatedTruck.getRating()) {
					highestRatedTruck = trucks[i];
				}
				totalRatings += trucks[i].getRating();

			}else {
				averageRating = totalRatings/(i);
				break;
			}
		}int menu;
			do {
			System.out.println(
					"Selct an option. \n1 - Display all food trucks \n2- Display average rating \n3 - Display highest-rated food truck \n4 - Quit");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				for (FoodTruck foodTruck : trucks) {
					if (foodTruck != null) {
						System.out.println(foodTruck.getName());
					}
				}
				break;
			case 2:
				System.out.println("The average food truck rating is " + averageRating);
				break;
			case 3:
				System.out.println(highestRatedTruck.toString());
				break;
			case 4:
				System.out.println("OK, goodbye");
				break;
			default:
				break;
			}
		}while(menu != 4);
		sc.close();
	}
}
