package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

//	Actions actions;
    WebDriverWait wait;
	
	
	@FindBy(xpath = "//div/span[contains(text(),'Secure Checkout')]") 
    		private WebElement secureCheckout;
	
	public ConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	//	 actions = new Actions(driver);
		  	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		  	}

	
	public String confirmationMsg() {
		
		wait.until(ExpectedConditions.visibilityOf(secureCheckout));
		String msg = secureCheckout.getText();
		return msg;
		}
}
