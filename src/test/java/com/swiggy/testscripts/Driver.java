package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.pages.AddItemPage;
import com.swiggy.pages.ConfirmationPage;
import com.swiggy.pages.FirstRestaurantPage;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.RestaurantList;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static FirstRestaurantPage firstRestaurantPage;
	protected static AddItemPage addItemPage ;
	protected static ConfirmationPage confirmationPage;
	protected static RestaurantList restaurantList;
	
	
	public static void init() {
		
		//None of the import libraries related to java classes got added.
		
		driver = new ChromeDriver();
		landingPage = new LandingPage(driver);
		firstRestaurantPage = new FirstRestaurantPage(driver);
		addItemPage = new AddItemPage(driver);
		confirmationPage = new ConfirmationPage(driver);
		restaurantList = new RestaurantList(driver);
	}

}
