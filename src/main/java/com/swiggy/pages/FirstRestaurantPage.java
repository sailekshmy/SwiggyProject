package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstRestaurantPage {

	Actions actions;
	WebDriverWait wait;
	
	@FindBy(xpath ="(//div[contains(text(),'Promoted')])[1] ")
	private WebElement firstRestaurant;
	

	public FirstRestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		  		actions = new Actions(driver);
		  	  	wait = new WebDriverWait(driver,Duration.ofSeconds(40));
}
	
	public void clickFirstRestaurant() {
		wait.until(ExpectedConditions.visibilityOf(firstRestaurant));
		firstRestaurant.click();
	}
	
	
}
